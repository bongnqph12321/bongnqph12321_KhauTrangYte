package poly.store.respository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import poly.store.domain.Category;
import poly.store.domain.Product;
@Repository
public interface ProductReprository extends JpaRepository<Product,Integer>{
	List<Product> findByNameContaining(String name);
	Page<Product> findByNameContaining(String name,Pageable pageable);
	@Query("SELECT p FROM Product p WHERE p.category.categoryId=?1")
	List<Product> findbyCategoryId(String cid);
}
