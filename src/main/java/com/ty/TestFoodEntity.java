package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestFoodEntity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder food = new FoodOrder();
		food.setStatus("under process");
		food.setTowhom("kavya");
		
		Item item = new Item();
		item.setName("veg biriyani");
		item.setQuantity(2);
		item.setCost(249.99);
		
		Item item2 = new Item();
		item2.setName("parota");
		item2.setQuantity(1);
		item2.setCost(100.50);
		
		List<Item> list = new ArrayList<Item>();
		list.add(item);
		list.add(item2);
		
		food.setItems(list);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(food);
		entityManager.persist(item);
		entityManager.persist(item2);
		entityTransaction.commit();
	}

}
