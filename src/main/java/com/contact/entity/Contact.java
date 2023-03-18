package com.contact.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Contact_Details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String name;
	private String email;
	private long phno;
	private String activesw;
	//active switch -soft delete(temerary inactive)/hard delete(permenantly delete)

}
