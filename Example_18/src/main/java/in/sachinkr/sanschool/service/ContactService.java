package in.sachinkr.sanschool.service;

import in.sachinkr.sanschool.model.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    // Save contact detail into the db
    // @param Contact object
    // @return boolean
    public boolean saveContact(Contact contact){
        boolean isSaved = false;
        System.out.println(contact.toString());
        isSaved = true;
        return isSaved;
    }
}
