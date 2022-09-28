package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchMobileSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Mobile mobile =entityManager.find(Mobile.class, 1);
		if(mobile!=null) {
			System.out.println(mobile.getId());
			System.out.println(mobile.getName());
			System.out.println(mobile.getCost());
			System.out.println();
			List<Sim> sim=mobile.getSims();
			for(Sim s : sim) {
				System.out.println(s.getId());
				System.out.println(s.getName());
				System.out.println(s.getProvider());
			}
		
		}else {
		System.out.println("data not found");
		}

	}

}
