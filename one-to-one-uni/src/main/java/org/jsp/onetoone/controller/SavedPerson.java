package org.jsp.onetoone.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Transaction;
import org.jsp.onetooneuni.dto.AadharCard;
import org.jsp.onetooneuni.dto.Person;

public class SavedPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("ABC");
		p.setPhone(887788);
		p.setEmail("abc@gmail.com");
		AadharCard card = new AadharCard();
		card.setNumber(38433524387243L);
		card.setDob(LocalDate.parse("1987-07-07"));
		card.setPincode(560076);
		p.setAadhar(card);
		EntityManager manager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		manager.persist(p);
		
	}
}
