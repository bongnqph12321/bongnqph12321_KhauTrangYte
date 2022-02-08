package poly.store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import poly.store.domain.Category;
import poly.store.domain.Product;
import poly.store.service.CategoryService;
import poly.store.service.ProductService;

@Controller
public class HomePageController {
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	@GetMapping("shop")
	public String shop() {
		return "admin/shop";
	}
	
	
	@GetMapping("product/list")
	public String findByCategoryId(Model model,@RequestParam("cid") Optional<String> cid) {
		if(cid.isPresent()) {
			List<Product> list = productService.findBycategoryId(cid.get());
			model.addAttribute("items",list);
		}
		else {
			List<Product> list = productService.findAll();
			model.addAttribute("items",list);
		}
		return "admin/index";
	}
	
	
}
