package poly.store.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import poly.store.domain.Order;
@Repository
public interface OrderReprository extends JpaRepository<Order, Long>{
	@Query("SELECT o FROM Order o WHERE o.acount.username=?1")
	List<Order> findbyUsername(String username);
	
	/*
	 * @Query("SELECT o FROM Orders o WHERE o.acount.username=?1") List<Order>
	 * findByUsername(String username);
	 */

}
