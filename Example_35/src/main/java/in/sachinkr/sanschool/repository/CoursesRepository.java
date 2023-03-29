package in.sachinkr.sanschool.repository;

import in.sachinkr.sanschool.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Integer> {

}
