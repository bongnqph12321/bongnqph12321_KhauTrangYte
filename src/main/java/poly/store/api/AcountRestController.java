package poly.store.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poly.store.domain.Acount;
import poly.store.domain.Product;
import poly.store.service.AcountService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/acount")
public class AcountRestController {
	@Autowired
	AcountService acountService;
	
	@GetMapping("list")
	public List<Acount> getAll(){
		return acountService.findAll();
	}
}
