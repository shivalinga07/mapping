package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchHospitalBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Branch branch = entityManager.find(Branch.class, 1);
		if(branch!=null) {
			System.out.println(branch.getId());
			System.out.println(branch.getLocation());
			System.out.println(branch.getCity());
			System.out.println(branch.getPhone());
			System.out.println();
			Hospital hospital = branch.getHospital();
			System.out.println(hospital.getId());
			System.out.println(hospital.getName());
			System.out.println(hospital.getWebsite());
		}else {
			System.out.println("data not matched");
		}

	}

}
