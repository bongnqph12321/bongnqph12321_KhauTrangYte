package poly.store.respository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.store.domain.Category;

@Repository
public interface CategoryReprository extends JpaRepository<Category, Long>{
	List<Category> findByNameContaining(String name);
	Page<Category> findByNameContaining(String name,Pageable pageable);
}
