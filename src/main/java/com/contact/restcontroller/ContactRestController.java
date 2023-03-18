package com.contact.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/contactApp")
public class ContactRestController {
	@Autowired
	private ContactService service;
    @PostMapping("/contact")
	public ResponseEntity<String> upsertContact(@RequestBody Contact contact) {
    	String upsertContact = service.upsertContact(contact);
		return new ResponseEntity<>(upsertContact,HttpStatus.CREATED);
	}
    @GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAllContact() {
    	List<Contact> allContact = service.getAllContact();
		return new ResponseEntity<>(allContact,HttpStatus.OK);

	}
    @GetMapping("/contact/{cId}")
	public ResponseEntity<Contact> getContact(@PathVariable int cId) {
    	Contact contact = service.getContact(cId);
		return new ResponseEntity<>(contact,HttpStatus.OK);

	}
    @DeleteMapping("/contact/{cId}")
	public ResponseEntity<String> deleteContact(@PathVariable int cId) {
    	String deleteContact = service.deleteContact(cId);
		return new ResponseEntity<>(deleteContact,HttpStatus.OK);

	}
}
