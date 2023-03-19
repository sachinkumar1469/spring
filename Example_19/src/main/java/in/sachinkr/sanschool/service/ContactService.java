package in.sachinkr.sanschool.service;

import in.sachinkr.sanschool.model.Contact;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Service
//@RequestScope
//@SessionScope
@ApplicationScope
public class ContactService {

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

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
