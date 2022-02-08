package poly.store.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import poly.store.domain.Category;
import poly.store.domain.Product;
import poly.store.respository.CategoryReprository;
import poly.store.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	CategoryReprository categoryReprository;

	public CategoryServiceImpl(CategoryReprository categoryReprository) {
		this.categoryReprository = categoryReprository;
	}
	
	
	
	@Override
	public List<Category> findByNameContaining(String name) {
		return categoryReprository.findByNameContaining(name);
	}



	@Override
	public Page<Category> findByNameContaining(String name, Pageable pageable) {
		return categoryReprository.findByNameContaining(name, pageable);
	}



	@Override
	public <S extends Category> S save(S entity) {		
		return categoryReprository.save(entity);
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryReprository.findAll(pageable);
	}

	@Override
	public List<Category> findAll() {
		return categoryReprository.findAll();
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryReprository.findAll(sort);
	}

	@Override
	public List<Category> findAllById(Iterable<Long> ids) {
		return categoryReprository.findAllById(ids);
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryReprository.findById(id);
	}

	@Override
	public <S extends Category> List<S> saveAll(Iterable<S> entities) {
		return categoryReprository.saveAll(entities);
	}

	@Override
	public void flush() {
		categoryReprository.flush();
	}

	@Override
	public <S extends Category> S saveAndFlush(S entity) {
		return categoryReprository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return categoryReprository.existsById(id);
	}

	@Override
	public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
		return categoryReprository.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Category> boolean exists(Example<S> example) {
		return categoryReprository.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<Category> entities) {
		categoryReprository.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return categoryReprository.count();
	}

	@Override
	public void deleteById(Long id) {
		categoryReprository.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		categoryReprository.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Category entity) {
		categoryReprository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		categoryReprository.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		categoryReprository.deleteAllInBatch();
	}

	@Override
	public void deleteAll(Iterable<? extends Category> entities) {
		categoryReprository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		categoryReprository.deleteAll();
	}

	@Override
	public Category getById(Long id) {
		return categoryReprository.getById(id);
	}


	
}
