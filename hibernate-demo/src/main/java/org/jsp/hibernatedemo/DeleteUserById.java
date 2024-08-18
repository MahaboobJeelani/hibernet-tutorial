package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteUserById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id to delete record");
		int id = sc.nextInt();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		User u = s.get(User.class, id);
		if(u != null) {
			Transaction t = s.beginTransaction();
			s.delete(u);
			t.commit();
			System.out.println("User found and delete");
		}else {
			System.out.println("You have enter invalid id");
		}
	}
}
