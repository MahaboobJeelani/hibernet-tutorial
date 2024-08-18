package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Person;

public class UpdatePerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Personid to update");
		int id = sc.nextInt();
		System.out.println("Enter the age, name, phone, gender and email to update");
		Person p = new Person();
		p.setId(id);
		p.setAge(sc.nextInt());
		p.setName(sc.next());
		p.setPhone(sc.nextLong());
		p.setGender(sc.next());
		p.setEmail(sc.next());
		EntityManager manager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		manager.merge(p);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
	}

}
