package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchFoodItem {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Items items = entityManager.find(Items.class, 1);
		if(items!=null) {
			System.out.println(items.getId());
			System.out.println(items.getName());
			System.out.println(items.getQuantity());
			System.out.println(items.getCost());
			System.out.println();
			FoodOrder foodOrder = items.getFoodOrder();
			System.out.println(foodOrder.getId());
			System.out.println(foodOrder.getToName());
			System.out.println(foodOrder.getStatus());
		}else {
			System.out.println("data not matched");
		}

	}

}
