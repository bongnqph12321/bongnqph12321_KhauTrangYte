package poly.store.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import poly.store.domain.Order;
import poly.store.domain.OrderDetail;
import poly.store.respository.OrderDetailReprository;
import poly.store.respository.OrderReprository;
import poly.store.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired 
	OrderReprository orderReprository;
	
	@Autowired
	OrderDetailReprository detailReprository;

	@Override
	public <S extends Order> S save(S entity) {
		return orderReprository.save(entity);
	}

	@Override
	public <S extends Order> Optional<S> findOne(Example<S> example) {
		return orderReprository.findOne(example);
	}

	@Override
	public Page<Order> findAll(Pageable pageable) {
		return orderReprository.findAll(pageable);
	}

	@Override
	public List<Order> findAll() {
		return orderReprository.findAll();
	}

	@Override
	public List<Order> findAll(Sort sort) {
		return orderReprository.findAll(sort);
	}

	@Override
	public List<Order> findAllById(Iterable<Long> ids) {
		return orderReprository.findAllById(ids);
	}

	@Override
	public Optional<Order> findById(Long id) {
		return orderReprository.findById(id);
	}

	@Override
	public <S extends Order> List<S> saveAll(Iterable<S> entities) {
		return orderReprository.saveAll(entities);
	}

	@Override
	public void flush() {
		orderReprository.flush();
	}

	@Override
	public <S extends Order> S saveAndFlush(S entity) {
		return orderReprository.saveAndFlush(entity);
	}

	@Override
	public <S extends Order> List<S> saveAllAndFlush(Iterable<S> entities) {
		return orderReprository.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable) {
		return orderReprository.findAll(example, pageable);
	}

	@Override
	public long count() {
		return orderReprository.count();
	}

	@Override
	public void deleteById(Long id) {
		orderReprository.deleteById(id);
	}

	@Override
	public void delete(Order entity) {
		orderReprository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		orderReprository.deleteAllById(ids);
	}

	@Override
	public Order getOne(Long id) {
		return orderReprository.getOne(id);
	}

	@Override
	public void deleteAll() {
		orderReprository.deleteAll();
	}

	@Override
	public Order getById(Long id) {
		return orderReprository.getById(id);
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example) {
		return orderReprository.findAll(example);
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {
		return orderReprository.findAll(example, sort);
	}

	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();
		
		Order order = mapper.convertValue(orderData, Order.class);
		orderReprository.save(order);
		TypeReference<List<OrderDetail>> type = new TypeReference<List<OrderDetail>>() {};
		List<OrderDetail> details  = mapper.convertValue(orderData.get("orderDetails"), type)
				.stream().peek(d -> d.setOrder(order)).collect(Collectors.toList());
		detailReprository.saveAll(details);
		return order;
	}

	@Override
	public Order findbyId(Long id) {
		return orderReprository.findById(id).get();
	}

	@Override
	public List<Order> findbyUsername(String username) {
		
		return orderReprository.findbyUsername(username);
	}

	/*
	 * @Override public List<Order> findByUsername(String username) { return
	 * orderReprository.findByUsername(username); }
	 */


	
	
}
