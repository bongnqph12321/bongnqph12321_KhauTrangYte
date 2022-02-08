package poly.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import poly.store.domain.Product;
import poly.store.service.ProductService;

@Controller
public class DetailController {
	@Autowired
	ProductService productService;
	@GetMapping("index/chi-tiet-san-pham")
	public String detail(Model model) {
		model.addAttribute("product",new Product());
		return "admin/detail";
	}
	@GetMapping("index/chi-tiet-san-pham/{productId}")
	public String show(ModelMap model,@PathVariable("productId")Integer productId) {
		Product product= productService.getById(productId);
		model.addAttribute("productss",product);
		return "admin/detail";
	}
}
