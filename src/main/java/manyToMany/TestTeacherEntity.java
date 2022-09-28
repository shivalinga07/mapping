package manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestTeacherEntity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();
		subject.setName("java");
		subject.setDays("60 days");
		
		Subject subject1 = new Subject();
		subject1.setName("jdbc");
		subject1.setDays("7 days");
		
		Subject subject2 = new Subject();
		subject2.setName("sql");
		subject2.setDays("10 days");
		
		Teacher teacher = new Teacher();
		teacher.setName("kalyan");
		teacher.setGender("male");
		
		Teacher teacher1 = new Teacher();
		teacher1.setName("kavya");
		teacher1.setGender("female");
		
		Teacher teacher2 = new Teacher();
		teacher2.setName("kusuma");
		teacher2.setGender("female");
		
		List<Subject> ls = new ArrayList<Subject>();
		ls.add(subject);
		ls.add(subject1); 
		teacher.setSubject(ls);
		
		List<Subject> ls1 = new ArrayList<Subject>();
		ls1.add(subject2);
		ls1.add(subject1);
		teacher1.setSubject(ls1);
		
		List<Subject> ls2 = new ArrayList<Subject>();
		ls2.add(subject);
		ls2.add(subject2);
		teacher2.setSubject(ls2);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(teacher2);
		entityManager.persist(teacher1);
		entityManager.persist(teacher);
		entityManager.persist(subject2);
		entityManager.persist(subject1);
		entityManager.persist(subject);
		entityTransaction.commit();
		
	}

}
