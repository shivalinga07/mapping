package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestFoodEntity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setToName("kavya");
		foodOrder.setStatus("placed");
		
		Items items = new Items();
		items.setName("pepsi");
		items.setQuantity(5);
		items.setCost(100);
		items.setFoodOrder(foodOrder);
		
		Items items1 = new Items();
		items1.setName("rice bath");
		items1.setQuantity(1);
		items1.setCost(100);
		items1.setFoodOrder(foodOrder);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityManager.persist(items);
		entityManager.persist(items1);
		entityTransaction.commit();
		
	}

}
