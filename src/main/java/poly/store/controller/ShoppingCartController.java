package poly.store.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import poly.store.service.ProductService;

@Controller
public class ShoppingCartController {
	@Autowired
	ProductService productService;
	
	@GetMapping("gio-hang/list")
	public String cart() {
		return "admin/cart";
	}
	
	@GetMapping("order/check-out")
	public String checkout() {
		return "admin/checkout";
	}
	
	
}
