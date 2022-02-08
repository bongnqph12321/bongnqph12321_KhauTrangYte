package poly.store.api;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poly.store.domain.Product;
import poly.store.respository.ProductReprository;
import poly.store.service.ProductService;


@CrossOrigin("*")
@RestController
@RequestMapping("/rest/products")
public class productRestController {
	@Autowired
	ProductService productService ;
	
	@GetMapping("list")
	public List<Product> getAll(){
		return productService.findAll();
	}
	@GetMapping("{ProductId}")
	public Product GetOne(@PathVariable("ProductId") Integer ProductId) {
		return productService.findbyId(ProductId);
	}
	
}
