package poly.store.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.store.service.OrderDetailService;
import poly.store.service.OrderService;

@Controller
@RequestMapping("admin")
public class OrderDetailController {
	@Autowired
	OrderService orderService;
	@Autowired
	OrderDetailService detailService;
	@GetMapping("Order/list")
	public String list(ModelMap model,HttpServletRequest request ) {
		String username= request.getRemoteUser();
		model.addAttribute("orders",orderService.findbyUsername(username));
		return "admin/Orders/list";
	}
	
	@RequestMapping("order/detail/{id}")
	public String detail(@PathVariable("id") Long id,Model model) {
		model.addAttribute("order",orderService.findById(id).get());
		return "admin/Orders/detail";
	}
	
	
}
