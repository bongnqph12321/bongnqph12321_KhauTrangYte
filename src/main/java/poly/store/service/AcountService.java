package poly.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import poly.store.domain.Acount;

public interface AcountService {
	
	<S extends Acount> List<S> findAll(Example<S> example, Sort sort);

	<S extends Acount> List<S> findAll(Example<S> example);

	Acount getById(String id);

	void deleteAll();

	Acount getOne(String id);

	void delete(Acount entity);

	void deleteById(String id);

	long count();

	<S extends Acount> boolean exists(Example<S> example);

	<S extends Acount> long count(Example<S> example);

	<S extends Acount> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Acount> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(String id);

	<S extends Acount> S saveAndFlush(S entity);

	void flush();

	<S extends Acount> List<S> saveAll(Iterable<S> entities);

	Optional<Acount> findById(String id);

	List<Acount> findAllById(Iterable<String> ids);

	List<Acount> findAll(Sort sort);

	List<Acount> findAll();

	Page<Acount> findAll(Pageable pageable);

	<S extends Acount> Optional<S> findOne(Example<S> example);

	<S extends Acount> S save(S entity);

	boolean checklogin(String username,String password);

	Acount findbyId(String username);
	

}
