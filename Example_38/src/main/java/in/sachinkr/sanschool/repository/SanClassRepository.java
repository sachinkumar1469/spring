package in.sachinkr.sanschool.repository;

import in.sachinkr.sanschool.model.SanClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanClassRepository extends JpaRepository<SanClass,Integer> {
}
