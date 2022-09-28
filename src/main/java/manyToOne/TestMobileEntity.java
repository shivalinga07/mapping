package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMobileEntity {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setName("Vivo");
		mobile.setCost(125000.99);
		
		Sim sim = new Sim();
		sim.setMobile(mobile);
		sim.setName("Jio 350");
		sim.setProvider("Jio");
		
		Sim sim1 = new Sim();
		sim1.setMobile(mobile);
		sim1.setName("Jio 700");
		sim1.setProvider("Jio");
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityTransaction.commit();
	}

}
