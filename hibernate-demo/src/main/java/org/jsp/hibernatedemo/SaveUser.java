package org.jsp.hibernatedemo;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser {

	public static void main(String[] args) {
		User u = new User();
		u.setName("tapan");
		u.setEmail("tapan@gmail.com");
		u.setPhone(2134567890L);
		u.setPassword("tapan12");
		System.out.println("user id before saving" + u.getId());
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		Serializable id = s.save(u);
		t.commit();
		System.out.println("user saved with id:" + id);
	}

}