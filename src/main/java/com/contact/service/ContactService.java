package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;



public interface ContactService {
   String upsertContact(Contact contact);
   List<Contact> getAllContact();
   Contact getContact(int cId);
   String deleteContact(int cId);
   
}
