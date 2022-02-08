package poly.store.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.store.domain.OrderDetail;

@Repository
public interface OrderDetailReprository extends JpaRepository<OrderDetail, Long> {

}
