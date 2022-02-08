package poly.store.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poly.store.domain.Category;
import poly.store.service.CategoryService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/categorys")
public class CategoryRestController {
	@Autowired
	CategoryService categoryService;
	@GetMapping("list")
	public List<Category> getAll(){
		return categoryService.findAll();
	}
}
