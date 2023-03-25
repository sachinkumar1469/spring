package in.sachinkr.sanschool.service;

import in.sachinkr.sanschool.constants.SanSchoolConstants;
import in.sachinkr.sanschool.model.Contact;
import in.sachinkr.sanschool.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

//    private int counter = 0;
//
//    public int getCounter() {
//        return counter;
//    }
//
//    public void setCounter(int counter) {
//        this.counter = counter;
//    }

    // Save contact detail into the db
    // @param Contact object
    // @return boolean
    public boolean saveContact(Contact contact){
        boolean isSaved = false;
        System.out.println("In contact service: "+contact.toString());
        contact.setStatus(SanSchoolConstants.OPEN);
        contact.setCreatedBy(SanSchoolConstants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());
        int rows = contactRepository.saveContactMsg(contact);
        if(rows>0){
            isSaved = true;
        }
        System.out.println("Rows affected: "+rows);
        return isSaved;
    }

    public List<Contact> findMsgWithOpenStatus() {
        return contactRepository.findMsgsWithStatus(SanSchoolConstants.OPEN);
    }

    public boolean changeStatusById(int id, String status,String name) {
        boolean isUpdated = false;
        int rows = contactRepository.changeStatusById(id,status,name);
        if(rows>0){
            isUpdated = true;
        }
        return isUpdated;
    }
}
