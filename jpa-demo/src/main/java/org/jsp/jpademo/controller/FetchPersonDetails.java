package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Person;

public class FetchPersonDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person id to display details");
		int id = sc.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		Person p =manager.find(Person.class, id);
		if(p!=null) {
			System.out.println("Person ID:" +p.getId());
			System.out.println("Name :" + p.getName());
			System.out.println("Phone Number : "+ p.getPhone());
			System.out.println("Email ID: "+ p.getEmail());
			System.out.println("Gender :" + p.getGender());
			System.out.println("Age : "+p.getAge());
		}
		else {
			System.out.println("You have Entered an invalid ID");
		}

	}

}
