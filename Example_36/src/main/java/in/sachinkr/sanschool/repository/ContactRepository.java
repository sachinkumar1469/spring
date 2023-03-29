package in.sachinkr.sanschool.repository;



/*
    @Repository stereotype annotation is used to add a bean of this class
    type to the Spring context and indicate that given Bean is used to perform
    DB related operations
*/

import in.sachinkr.sanschool.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Integer> {
    List<Contact> findByStatus(String status);
}
