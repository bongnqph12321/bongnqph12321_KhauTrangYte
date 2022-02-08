package poly.store.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import poly.store.domain.Acount;
import poly.store.model.AcountDto;
import poly.store.service.AcountService;

@Controller
@RequestMapping("admin/acounts")
public class AcountController {
	@Autowired
	AcountService acountService;
	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("acount",new AcountDto());
		return "admin/acounts/addOrEdit";
	}
	@PostMapping("saveOrUpdate")
	public ModelAndView saveOrUpdate(ModelMap model,@Valid @ModelAttribute("acount") AcountDto dto,
			BindingResult result) {
		if(result.hasErrors()) {			
			return new ModelAndView ("admin/acounts/addOrEdit");
		}
		Acount entity =  new Acount();
		BeanUtils.copyProperties(dto, entity);		
		acountService.save(entity);
		
		model.addAttribute("message","save is successted !");
		return new ModelAndView ("redirect:/admin/acounts/list",model);
	}
	@GetMapping("delete/{username}")
	public ModelAndView delete(ModelMap model, @PathVariable("username") String username) {
		acountService.deleteById(username);
		model.addAttribute("message","Acounts is deleted");
		return new ModelAndView( "forward:/admin/acounts/list",model);
	}
	@GetMapping("edit/{username}")
	public ModelAndView edit(ModelMap model,@PathVariable("username") String username) {
		Optional<Acount> opt = acountService.findById(username);
		AcountDto dto = new AcountDto();
		
		if(opt.isPresent()) {
			Acount entity = opt.get();
			BeanUtils.copyProperties(entity,dto);
			dto.setIsEdit(true);
			model.addAttribute("acount",dto);
			return new ModelAndView("admin/acounts/addOrEdit",model);
							
		}
		model.addAttribute("message","acounts is not existed");
		return new ModelAndView("forward:/admin/acounts/list",model);
	}
	@GetMapping("list")
	public String list(ModelMap model) { 
		List<Acount> list = acountService.findAll();
		model.addAttribute("acounts",list);
		return "admin/acounts/list";
	}
}
