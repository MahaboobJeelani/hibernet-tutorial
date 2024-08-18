package org.jsp.timestamp.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.timestamp.dto.User;

public class Fetchcache {
	public static void main(String[] args) {
		EntityManager manager1 = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		EntityManager manager2 = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		User u1 = manager1.find(User.class, 1);
		User u2 = manager1.find(User.class, 2);
		User u3 = manager1.find(User.class, 3);
		User u4 = manager1.find(User.class, 2);
		User u5 = manager2.find(User.class, 1);
		User u6 = manager2.find(User.class, 2);
		User u7 = manager2.find(User.class, 3);
		User u8 = manager2.find(User.class, 2);
		
	}
}
