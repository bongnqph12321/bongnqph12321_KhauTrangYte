package poly.store.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import poly.store.domain.Product;
import poly.store.respository.ProductReprository;
import poly.store.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductReprository productReprository;
	@Override
	public List<Product> findByNameContaining(String name) {
		return productReprository.findByNameContaining(name);
	}
	
	

	@Override
	public Page<Product> findByNameContaining(String name, Pageable pageable) {
		return productReprository.findByNameContaining(name, pageable);
	}



	@Override
	public <S extends Product> S save(S entity) {
		return productReprository.save(entity);
	}

	@Override
	public <S extends Product> Optional<S> findOne(Example<S> example) {
		return productReprository.findOne(example);
	}

	@Override
	public Page<Product> findAll(Pageable pageable) {
		return productReprository.findAll(pageable);
	}

	@Override
	public List<Product> findAll() {
		return productReprository.findAll();
	}

	@Override
	public List<Product> findAll(Sort sort) {
		return productReprository.findAll(sort);
	}

	@Override
	public List<Product> findAllById(Iterable<Integer> ids) {
		return productReprository.findAllById(ids);
	}

	@Override
	public Optional<Product> findById(Integer id) {
		return productReprository.findById(id);
	}
	
	@Override
	public <S extends Product> List<S> saveAll(Iterable<S> entities) {
		return productReprository.saveAll(entities);
	}

	@Override
	public void flush() {
		productReprository.flush();
	}

	@Override
	public <S extends Product> S saveAndFlush(S entity) {
		return productReprository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return productReprository.existsById(id);
	}

	@Override
	public <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities) {
		return productReprository.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
		return productReprository.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<Product> entities) {
		productReprository.deleteInBatch(entities);
	}

	@Override
	public <S extends Product> long count(Example<S> example) {
		return productReprository.count(example);
	}

	@Override
	public <S extends Product> boolean exists(Example<S> example) {
		return productReprository.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<Product> entities) {
		productReprository.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return productReprository.count();
	}

	@Override
	public void deleteById(Integer id) {
		productReprository.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		productReprository.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Product entity) {
		productReprository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		productReprository.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		productReprository.deleteAllInBatch();
	}

	@Override
	public Product getOne(Integer id) {
		return productReprository.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends Product> entities) {
		productReprository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		productReprository.deleteAll();
	}

	@Override
	public Product getById(Integer id) {
		return productReprository.getById(id);
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> example) {
		return productReprository.findAll(example);
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
		return productReprository.findAll(example, sort);
	}



	@Override
	public Product findbyId(Integer id) {
		return productReprository.findById(id).get();
	}



	@Override
	public List<Product> findBycategoryId(String cid) {
		// TODO Auto-generated method stub
		return productReprository.findbyCategoryId(cid);
	}


}
