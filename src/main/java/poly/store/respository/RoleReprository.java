package poly.store.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.store.domain.Role;

@Repository
public interface RoleReprository extends JpaRepository<Role, String>{

}
