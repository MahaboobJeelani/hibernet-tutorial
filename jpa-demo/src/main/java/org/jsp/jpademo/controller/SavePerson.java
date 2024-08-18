package org.jsp.jpademo.controller;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Person;

public class SavePerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("abc");
		p.setAge(20);
		p.setEmail("abc@gmail.com");
		p.setPhone(777888);
		p.setGender("male");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		manager.persist(p);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		System.out.println("Person with Saved user id : " +p.getId());
	}
}
