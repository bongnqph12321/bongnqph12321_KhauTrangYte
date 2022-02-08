package poly.store.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import poly.store.domain.Acount;
import poly.store.domain.Category;
import poly.store.domain.Product;
import poly.store.model.AcountDto;
import poly.store.service.AcountService;
import poly.store.service.CategoryService;
import poly.store.service.ProductService;

@Controller
public class LoginController {
	@Autowired
	ProductService productService;
	//@Autowired
	//AcountService acountService;
	@Autowired
	CategoryService categoryService;
	@GetMapping("Login")
	public String login(Model model) {
		//model.addAttribute("acount",new AcountDto());
		return "admin/login";   
	}
	@GetMapping("home-page")
	public String index(ModelMap model) {
		List<Product> list = productService.findAll();
		List<Category> list1 = categoryService.findAll();
		model.addAttribute("categories",list1);
		model.addAttribute("products",list);
		return "admin/index";
	}
	
	/*
	 * @PostMapping("home-page") public String checklogin(ModelMap
	 * model,@RequestParam("username")String username,
	 * 
	 * @RequestParam("password")String password) {
	 * if(acountService.checklogin(username, password)) { List<Product> list =
	 * productService.findAll(); model.addAttribute("products",list);
	 * System.out.println("login thanh cong !"); return "admin/index"; }
	 * System.out.println("login that bai!");
	 * model.addAttribute("message","Username hoặc Password không chính xác!");
	 * return "admin/login"; }
	 */
}

