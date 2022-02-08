package poly.store.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import poly.store.domain.Acount;
import poly.store.respository.AcountReprository;
import poly.store.service.AcountService;
@Service
public class AcountServiceImpl implements AcountService{
	@Autowired
	AcountReprository acountReprository;
	@Override
	public <S extends Acount> S save(S entity) {
		return acountReprository.save(entity);
	}
	

	@Override
	public <S extends Acount> Optional<S> findOne(Example<S> example) {
		return acountReprository.findOne(example);
	}

	@Override
	public Page<Acount> findAll(Pageable pageable) {
		return acountReprository.findAll(pageable);
	}

	@Override
	public List<Acount> findAll() {
		return acountReprository.findAll();
	}

	@Override
	public List<Acount> findAll(Sort sort) {
		return acountReprository.findAll(sort);
	}

	@Override
	public List<Acount> findAllById(Iterable<String> ids) {
		return acountReprository.findAllById(ids);
	}

	@Override
	public Optional<Acount> findById(String id) {
		return acountReprository.findById(id);
	}

	@Override
	public <S extends Acount> List<S> saveAll(Iterable<S> entities) {
		return acountReprository.saveAll(entities);
	}

	@Override
	public void flush() {
		acountReprository.flush();
	}

	@Override
	public <S extends Acount> S saveAndFlush(S entity) {
		return acountReprository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(String id) {
		return acountReprository.existsById(id);
	}

	@Override
	public <S extends Acount> List<S> saveAllAndFlush(Iterable<S> entities) {
		return acountReprository.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Acount> Page<S> findAll(Example<S> example, Pageable pageable) {
		return acountReprository.findAll(example, pageable);
	}

	@Override
	public <S extends Acount> long count(Example<S> example) {
		return acountReprository.count(example);
	}

	@Override
	public <S extends Acount> boolean exists(Example<S> example) {
		return acountReprository.exists(example);
	}

	@Override
	public long count() {
		return acountReprository.count();
	}

	@Override
	public void deleteById(String id) {
		acountReprository.deleteById(id);
	}

	@Override
	public void delete(Acount entity) {
		acountReprository.delete(entity);
	}

	@Override
	public Acount getOne(String id) {
		return acountReprository.getOne(id);
	}

	@Override
	public void deleteAll() {
		acountReprository.deleteAll();
	}

	@Override
	public Acount getById(String id) {
		return acountReprository.getById(id);
	}

	@Override
	public <S extends Acount> List<S> findAll(Example<S> example) {
		return acountReprository.findAll(example);
	}

	@Override
	public <S extends Acount> List<S> findAll(Example<S> example, Sort sort) {
		return acountReprository.findAll(example, sort);
	}
	
	@Override
	public boolean checklogin(String username, String password) {
		Optional<Acount> optionalAcount = findById(username);
		if(optionalAcount.isPresent()&&optionalAcount.get().getPassword().equals(password)) {
			return true;
		}
		return false;
	}


	@Override
	public Acount findbyId(String username) {
		return acountReprository.findById(username).get();
	}


}
