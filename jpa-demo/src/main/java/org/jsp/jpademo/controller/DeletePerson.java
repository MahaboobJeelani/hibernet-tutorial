package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Person;

public class DeletePerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person ID to Delete the record");
		int id = sc.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("jps").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Person p = manager.find(Person.class, id);
		if(p != null) {
			manager.remove(p);
			System.out.println("Person Deleted");
			transaction.begin();
			transaction.commit();
		}
		else {
			System.out.println("Cannot delete person");
		}

	}

}
