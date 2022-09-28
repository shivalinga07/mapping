package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveEntity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile();
		mobile.setName("Nokia 500");
		mobile.setCost(600);
		
		Sim sim1 = new Sim();
		sim1.setName("Airtel sim");
		sim1.setProvider("Airtel");
		sim1.setMobile(mobile);
		
		Sim sim2 = new Sim();
		sim2.setName("Jio sim");
		sim2.setProvider("Jio");
		sim2.setMobile(mobile);
		
		List<Sim> sims = new ArrayList<Sim>();
		sims.add(sim1);
		sims.add(sim2);
		
		mobile.setSims(sims);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
	}

}
