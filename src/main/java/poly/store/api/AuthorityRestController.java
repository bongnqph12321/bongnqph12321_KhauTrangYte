package poly.store.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import poly.store.domain.Authority;
import poly.store.respository.AcountReprository;
import poly.store.respository.AuthoritiesReprository;
import poly.store.respository.RoleReprository;

@CrossOrigin("*")
@RestController
public class AuthorityRestController {
	@Autowired
	AuthoritiesReprository authoritiesReprository;
	
	@Autowired
	RoleReprository roleReprository;
	
	@Autowired
	AcountReprository acountReprository;
	@GetMapping("/rest/authorities")
	public Map<String, Object> getAuthorities(){
		Map<String, Object> data = new HashMap<>();
		data.put("authorities",authoritiesReprository.findAll());
		data.put("accounts",acountReprository.findAll());
		data.put("roles",roleReprository.findAll());
		return data;
	}
	
	@PostMapping("/rest/authorities")
	public Authority create(@RequestBody Authority authorities) {
		return authoritiesReprository.save(authorities);
	}
	
	@DeleteMapping("/rest/authorities/{id}")
	public void create(@PathVariable("id") Integer id) {
		authoritiesReprository.deleteById(id);
	
	}
}
