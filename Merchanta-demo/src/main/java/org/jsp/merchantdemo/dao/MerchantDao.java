package org.jsp.merchantdemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.merchantdemo.dto.Merchant;

public class MerchantDao {
	EntityManager manager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	public Merchant saveMerchant(Merchant merchant) {
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(merchant);
		transaction.begin();
		transaction.commit();
		return merchant;
	}
	public Merchant updateMerchant(Merchant merchant) {
		EntityTransaction transaction = manager.getTransaction();
		manager.merge(merchant);
		transaction.begin();
		transaction.commit();
		return merchant;
	}
}
