package in.sachinkr.sanschool.service;

import in.sachinkr.sanschool.constants.SanSchoolConstants;
import in.sachinkr.sanschool.model.Person;
import in.sachinkr.sanschool.model.Roles;
import in.sachinkr.sanschool.repository.PersonRepository;
import in.sachinkr.sanschool.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    public boolean createNewPerson(Person person) {
        Roles roles = rolesRepository.getByRoleName(SanSchoolConstants.STUDENT_ROLE);
        person.setRoles(roles);
        person.setPwd(passwordEncoder.encode(person.getPwd()));
        Person savedPerson = personRepository.save(person);
//        System.out.println("Primary Key of saved person is: "+person.getPersonId());
        if(savedPerson!=null && savedPerson.getPersonId() > 0){
            return true;
        } else {
            return false;
        }
    }
}
