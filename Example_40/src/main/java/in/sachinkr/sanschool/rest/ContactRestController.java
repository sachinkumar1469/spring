package in.sachinkr.sanschool.rest;

import in.sachinkr.sanschool.model.Contact;
import in.sachinkr.sanschool.model.Response;
import in.sachinkr.sanschool.repository.ContactRepository;
import jakarta.validation.Valid;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/contact")
public class ContactRestController {

    @Autowired
    ContactRepository contactRepository;

    @RequestMapping("/getMessagesByStatus")
    @ResponseBody
    public List<Contact> getMsgbyRest(@RequestParam("status") String status){
        return contactRepository.findByStatus(status);
    }

    @RequestMapping("/getAllMsgByStatus")
    @ResponseBody
    public List<Contact> getAllMsg(@RequestBody Contact contact){
        System.out.println(">>>>>>>>>>>>>"+contact.getName());
        System.out.println(">>>>>>>>>>>>> toString "+contact.toString());
        return contactRepository.findByStatus(contact.getStatus());

    }

    @PostMapping("/saveNewMsg")
    public ResponseEntity<Response> saveNewContact(@RequestHeader("inovactionFrom") String inovactionFrom,
                                                   @Valid @RequestBody Contact contact,
                                                   Errors errors){
        System.out.println("Header is :"+inovactionFrom);
        Response response = new Response();
        response.setStatusCode("200");
        response.setStatusMsg("Contact saved successfully");
        contactRepository.save(contact);

        return ResponseEntity.status(HttpStatus.CREATED)
                .header("isSaved","true")
                .body(response);
    }

    @DeleteMapping("/deleteMsg")
    public ResponseEntity<Response> deleteContact(RequestEntity<Contact> requestEntity){
        HttpHeaders httpHeaders = requestEntity.getHeaders();
        httpHeaders.forEach((key,value)->{
            System.out.println(">>>>>>> Header is: "+key+" => "+value.stream().collect(Collectors.joining("|")));
        });
        Contact contact = requestEntity.getBody();
        contactRepository.deleteById(contact.getContactId());
        Response response = new Response();
        response.setStatusMsg("200");
        response.setStatusMsg("Contact Deleted");
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("isDeleted","true")
                .body(response);
    }

    @PatchMapping("/closeMsg")
    public ResponseEntity<Response> closeContact(RequestEntity<Contact> requestEntity){
        Contact contact = requestEntity.getBody();
        int rows = contactRepository.updateStatusById("Close",contact.getContactId());
        System.out.println("Rows affected: "+rows);
        Response response = new Response();
        response.setStatusCode("200");
        response.setStatusMsg("Message Closed");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
