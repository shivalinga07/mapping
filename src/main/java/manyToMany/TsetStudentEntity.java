package manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TsetStudentEntity {
	public static void main(String[] args) {
		
	Student student1 = new Student();
	student1.setName("karna");
	student1.setEmail("karna@123");
	
	Student student2 = new Student();
	student2.setName("kalyan");
	student2.setEmail("kalyan@123");
	
	Course course = new Course();
	course.setName("english");
	course.setCost(1200);
	
	Course course1 = new Course();
	course1.setName("hindi");
	course1.setCost(1000);
	
	Course course2 = new Course();
	course2.setName("kannada");
	course2.setCost(1300);

	List<Course> ls = new ArrayList<Course>();
	ls.add(course);
	ls.add(course1);
	ls.add(course2);
	
	student1.setCourse(ls);
	
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	Course c1 = entityManager.find(Course.class, 1);
	Course c2 = entityManager.find(Course.class, 3);
	List<Course> ls1 = new ArrayList<Course>();
	ls1.add(c1);
	ls1.add(c2);
	student2.setCourse(ls1);
	entityTransaction.begin();
	entityManager.persist(student2);
//	entityManager.persist(course);
//	entityManager.persist(c1);
//	entityManager.persist(c2);
	entityTransaction.commit();

	
	
	}
}
