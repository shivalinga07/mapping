package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestHospitalEntity {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("Apollo");
		hospital.setWebsite("apollo@gmail.com");
		
		Branch branch = new Branch();
		branch.setLocation("baanerughatta");
		branch.setCity("bangalore");
		branch.setPhone(9113250629l);
		branch.setHospital(hospital);
		
		Branch branch1 = new Branch();
		branch1.setLocation("yashavantapur");
		branch1.setCity("bangalore");
		branch1.setPhone(9916129483l);
		branch1.setHospital(hospital);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityTransaction.commit();
	}

}
