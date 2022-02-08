package poly.store.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import poly.store.domain.Acount;
import poly.store.model.AcountDto;
import poly.store.service.AcountService;

@Controller
public class RegisterController {
	@Autowired
	AcountService acountService;
	@GetMapping("Register")
	public String add(Model model) {
		model.addAttribute("acount",new AcountDto());
		return "admin/Register";
	}
	
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(ModelMap model,@Valid @ModelAttribute("acount") AcountDto dto,
			BindingResult result) {
		if(result.hasErrors()) {			
			return "admin/Register";
		}
		Acount entity =  new Acount();
		BeanUtils.copyProperties(dto, entity);		
		acountService.save(entity);
		
		model.addAttribute("message","Dang ky thanh cong !");
		return "admin/Register";
	} 
}
