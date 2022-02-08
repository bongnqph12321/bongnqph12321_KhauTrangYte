const app = angular.module("shopping-cart-app",[]);

app.controller("shopping-cart-ctrl",function($scope,$http){
	$scope.cart =  {
        items : [],
        add(ProductId){  
            alert("Thêm thành công !")
            var item = this.items.find(item => item.ProductId  ==  ProductId);
            if(item){
                item.qty++;
                this.saveToLocalStorage();
            }
              else{
                $http.get(`/rest/products/${ProductId}`).then(resp=>{
                    resp.data.qty = 1;
                    this.items.push(resp.data);
                    this.saveToLocalStorage();
                })
            }
        },  
        remove(productId){
			alert("Bạn có chắc chắn muốn xóa !")
     		var index = this.items.findIndex(item => item.productId == productId);
            this.items.splice(index,1);
            this.saveToLocalStorage();
        },
        clear(){
            this.items = []
            this.saveToLocalStorage();
        },
        amt_of(item){},
        get count(){
            return this.items
                .map(item => item.qty)
                .reduce((total,qty)=>total +=  qty,0);
        },
        get amount(){
            return this.items
                .map(item => item.qty*item.price)
                .reduce((total,qty)=>total +=  qty,0);
        },
        saveToLocalStorage(){
            var json = JSON.stringify(angular.copy(this.items));
            localStorage.setItem("cart",json);
        },
        //doc gio hang tu local storage
        loadFromLocalStorage(){
            var json = localStorage.getItem("cart");
            this.items = json ? JSON.parse(json) : [];
        },
    }
    $scope.cart.loadFromLocalStorage();

    $scope.order = {
        createDate:new Date(),
        address:"",
        acount:{username:$("#username").text()},
        get orderDetails(){
            return  $scope.cart.items.map(item => {
                return {
                    product:{productId:item.productId},  
                    price:item.price,
                    quantity:item.qty
                }
            }); 
        },
        purchase(){
            var order  = angular.copy(this);
            $http.post("/rest/orders",order).then(resp =>{
                alert("Đặt hàng thành công !")
                $scope.cart.clear();
                location.href= "/order/check-out";        
            }).catch(error => { 
                alert("đặt hàng lỗi !")
                console.log(error) 
            })
        }

    }
}
)