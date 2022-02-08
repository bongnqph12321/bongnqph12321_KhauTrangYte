package poly.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.fasterxml.jackson.databind.JsonNode;

import poly.store.domain.Order;

public interface OrderService {

	<S extends Order> List<S> findAll(Example<S> example, Sort sort);

	<S extends Order> List<S> findAll(Example<S> example);

	Order getById(Long id);

	void deleteAll();

	Order getOne(Long id);

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(Order entity);

	void deleteById(Long id);

	long count();

	<S extends Order> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Order> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends Order> S saveAndFlush(S entity);

	void flush();

	<S extends Order> List<S> saveAll(Iterable<S> entities);

	Optional<Order> findById(Long id);

	List<Order> findAllById(Iterable<Long> ids);

	List<Order> findAll(Sort sort);

	List<Order> findAll();

	Page<Order> findAll(Pageable pageable);

	<S extends Order> Optional<S> findOne(Example<S> example);

	<S extends Order> S save(S entity);

	Order create(JsonNode orderData);

	Order findbyId(Long id);

	List<Order> findbyUsername(String username);

	/* List<Order> findByUsername(String username); */


	

}
