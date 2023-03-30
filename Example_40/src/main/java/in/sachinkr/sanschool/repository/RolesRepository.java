package in.sachinkr.sanschool.repository;

import in.sachinkr.sanschool.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Integer> {
    Roles getByRoleName(String roleName);
}
