import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyGstDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Company company= new Company();
		company.setName("spark");
		company.setAddress("bnglr");
		Gst gst = new Gst();
		gst.setNum("123fhfjggyiu465");
		gst.setStatus("active");
		gst.setCompany(company);
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
