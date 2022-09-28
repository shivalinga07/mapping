import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person= entityManager.find(Person.class, 2);
		if(person!=null) {
			System.out.println("--------person info-------------");
			System.out.println("person id is: " +person.getId());
			System.out.println("person name is: "+person.getName());
			System.out.println("person gender is: "+person.getGender());
			
			Pan pan = person.getPan();
			if(pan!=null) {
				System.out.println("------------pan details---------");
				System.out.println("pan id is: "+ pan.getId());
				System.out.println("pan num is: "+pan.getNumber());
				System.out.println("pan type is: "+pan.getType());
			}
		}else {
			System.out.println("don't have that id");
		}

	}

}
