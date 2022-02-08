package poly.store.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import poly.store.domain.Order;
import poly.store.service.OrderService;

@CrossOrigin("*")
@RestController
public class OrderRestController {
	@Autowired
	OrderService orderService;
	
	@PostMapping("/rest/orders")
	public Order create(@RequestBody JsonNode orderData) {
		return orderService.create(orderData);
	}
}
