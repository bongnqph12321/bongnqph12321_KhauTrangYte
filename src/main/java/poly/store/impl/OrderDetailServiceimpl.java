package poly.store.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


import poly.store.domain.OrderDetail;
import poly.store.respository.OrderDetailReprository;
import poly.store.service.OrderDetailService;
@Service
@SessionScope
public class OrderDetailServiceimpl implements OrderDetailService{
	
	@Autowired
	OrderDetailReprository orderDetailReprository;

	@Override
	public <S extends OrderDetail> S save(S entity) {
		return orderDetailReprository.save(entity);
	}

	@Override
	public Page<OrderDetail> findAll(Pageable pageable) {
		return orderDetailReprository.findAll(pageable);
	}

	@Override
	public List<OrderDetail> findAll() {
		return orderDetailReprository.findAll();
	}

	@Override
	public List<OrderDetail> findAll(Sort sort) {
		return orderDetailReprository.findAll(sort);
	}

	@Override
	public Optional<OrderDetail> findById(Long id) {
		return orderDetailReprository.findById(id);
	}

	@Override
	public <S extends OrderDetail> List<S> saveAll(Iterable<S> entities) {
		return orderDetailReprository.saveAll(entities);
	}

	@Override
	public boolean existsById(Long id) {
		return orderDetailReprository.existsById(id);
	}

	@Override
	public <S extends OrderDetail> Page<S> findAll(Example<S> example, Pageable pageable) {
		return orderDetailReprository.findAll(example, pageable);
	}

	@Override
	public <S extends OrderDetail> long count(Example<S> example) {
		return orderDetailReprository.count(example);
	}

	@Override
	public long count() {
		return orderDetailReprository.count();
	}

	@Override
	public void deleteById(Long id) {
		orderDetailReprository.deleteById(id);
	}

	@Override
	public void delete(OrderDetail entity) {
		orderDetailReprository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		orderDetailReprository.deleteAllById(ids);
	}

	@Override
	public OrderDetail getOne(Long id) {
		return orderDetailReprository.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends OrderDetail> entities) {
		orderDetailReprository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		orderDetailReprository.deleteAll();
	}

	@Override
	public OrderDetail getById(Long id) {
		return orderDetailReprository.getById(id);
	}

	@Override
	public <S extends OrderDetail> List<S> findAll(Example<S> example) {
		return orderDetailReprository.findAll(example);
	}

	@Override
	public <S extends OrderDetail> List<S> findAll(Example<S> example, Sort sort) {
		return orderDetailReprository.findAll(example, sort);
	}
	

	

	

	
	
}
