package com.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repo;

	@Override
	public String upsertContact(Contact contact) {
		Contact save = repo.save(contact);
		return "success";
	}

	@Override
	public List<Contact> getAllContact() {

		return repo.findAll();
	}

	@Override
	public Contact getContact(int cId) {
		Optional<Contact> findById = repo.findById(cId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int cId) {
		repo.deleteById(cId);
		return "success";
	}

}
