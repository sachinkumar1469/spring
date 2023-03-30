package in.sachinkr.sanschool.service;

import in.sachinkr.sanschool.constants.SanSchoolConstants;
import in.sachinkr.sanschool.model.Contact;
import in.sachinkr.sanschool.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

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
//        contact.setCreatedBy(SanSchoolConstants.ANONYMOUS);
//        contact.setCreatedAt(LocalDateTime.now());
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
        // NOrmal Way Of Updating
//        Optional<Contact> contact = contactRepository.findById(id);
//        contact.ifPresent(c -> {
//            c.setStatus(status);
////            c.setUpdatedBy(name);
////            c.setUpdatedAt(LocalDateTime.now());
//        });
//        Contact updatedContact = contactRepository.save(contact.get());
//        if(updatedContact != null && updatedContact.getUpdatedBy() !=null){
//            isUpdated = true;
//        }
        // Using custom query to update the status
        int rowsAff = contactRepository.updateStatusById(status,id);
        if(rowsAff>0){
            isUpdated = true;
        }
        System.out.println(">>>>>>>>>>>>>>>> isUpdated: "+isUpdated);
        return isUpdated;
    }

    public Page<Contact> findMsgWithOpenStatus(int pageNum, String sortField, String sortDir) {
        int pageSize = 5;
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize,
                sortDir.equals("asc") ? Sort.by(sortField).ascending() : Sort.by(sortField).descending());
        Page<Contact> msgPage = contactRepository.findByStatus(SanSchoolConstants.OPEN,pageable);
        return msgPage;
    }
}
