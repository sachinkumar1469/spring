package in.sachinkr.sanschool.service;

import in.sachinkr.sanschool.constants.SanSchoolConstants;
import in.sachinkr.sanschool.model.Contact;
import in.sachinkr.sanschool.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // Save contact detail into the db
    // @param Contact object
    // @return boolean
    public boolean saveContact(Contact contact){
        boolean isSaved = false;
        System.out.println("In contact service: "+contact.toString());
        contact.setStatus(SanSchoolConstants.OPEN);
        contact.setCreatedBy(SanSchoolConstants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());
        Contact contact1 = contactRepository.save(contact);
        if(contact1!=null && contact1.getContactId()>0){
            isSaved = true;
        }
        return isSaved;
    }

    public List<Contact> findMsgWithOpenStatus() {
//        return contactRepository.findMsgsWithStatus(SanSchoolConstants.OPEN);
        return contactRepository.findByStatus(SanSchoolConstants.OPEN);
    }

    public boolean changeStatusById(int id, String status,String name) {
        boolean isUpdated = false;
        Optional<Contact> contact = contactRepository.findById(id);
        contact.ifPresent(c -> {
            c.setStatus(status);
            c.setUpdatedBy(name);
            c.setUpdatedAt(LocalDateTime.now());
        });
        Contact updatedContact = contactRepository.save(contact.get());
        if(updatedContact != null && updatedContact.getUpdatedBy() !=null){
            isUpdated = true;
        }
        return isUpdated;
    }
}
