package poly.store.respository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.store.domain.Acount;

@Repository
public interface AcountReprository extends JpaRepository<Acount,String>{
	//List<Acount> findByNameContaining(String username);
}
