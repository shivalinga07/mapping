import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Person person = new Person();
		
		person.setName("kavya");
		person.setGender("female");
		
		Pan pan = new Pan();
		pan.setNumber("KNG12TY56");
		pan.setType("business");
		
	//	person.setPan(pan);
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
		
		
	}

}
