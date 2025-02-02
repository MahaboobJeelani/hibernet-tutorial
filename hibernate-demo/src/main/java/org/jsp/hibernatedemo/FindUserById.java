package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindUserById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your id display details");
		int id = sc.nextInt();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		User u = s.load(User.class, id);
		try {
			System.out.println("User id :" + u.getId());
			System.out.println("User Name :" + u.getName());
			System.out.println("User Phone : " + u.getPhone());
			System.out.println("User Email:" + u.getEmail());
		} catch (Exception e) {
			System.out.println("You entered Invalid id4");
		}
	}
}
