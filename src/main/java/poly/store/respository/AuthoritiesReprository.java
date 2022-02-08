package poly.store.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.store.domain.Authority;
@Repository
public interface AuthoritiesReprository extends JpaRepository<Authority,Integer>{

}
