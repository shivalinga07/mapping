package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchMobile {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Sim sim = entityManager.find(Sim.class, 1);
		if(sim!=null) {
			System.out.println(sim.getId());
			System.out.println(sim.getName());
			System.out.println(sim.getProvider());
			System.out.println();
			Mobile mobile = sim.getMobile();
			System.out.println(mobile.getId());
			System.out.println(mobile.getCost());
			System.out.println(mobile.getName());
		}else {
			System.out.println("data is not found");
		}

	}

}
