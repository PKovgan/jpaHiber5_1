package com.p.k;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.p.k.entity.Blogger;
import com.p.k.entity.Facebooker;
import com.p.k.entity.Guide;
import com.p.k.entity.Instagrammer;
import com.p.k.entity.Student;

public class MainJPA {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaHiber5");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
//		Guide guide = new Guide("121212", "Kyril", 10000);
//		Student student = new Student("11111", "Valeriy", guide);
//		Student student1 = new Student("22222", "Petro", guide);
		try {
		
		
			txn.begin();
			
//			em.persist(student);
//			em.persist(student1);
			
//			Query query = em.createQuery("select guide from Guide guide");
//			List<Guide> guides = query.getResultList();
//			for (Guide guide : guides)  System.out.println(guide); 
			
//			Query query = em.createQuery("select student from Student student left join fetch student.guide");
			Query query = em.createQuery("select student from Student student");
			List<Student> students = query.getResultList();
			for (Student student : students) System.out.println(student);
			
	//		Query query = em.createQuery("select guide.name, guide.salary from Guide as guide");
	//		List<Object[]> resultList = query.getResultList();
	//		for (Object[] objects : resultList) System.out.println("Object[] {objects[0]: " + objects[0] + ",objects[1]: " + objects[1] + "}");
	
	//		String name = "Gregory";
	//		Query query = em.createQuery("select guide from Guide as guide where guide.name= '" + name + "'");
	//		List<Guide> guides = query.getResultList();
	//		for (Guide guide : guides)  System.out.println(guide);
			
	//		Query query = em.createQuery("select guide from Guide as guide where guide.name=:name");
	//		query.setParameter("name", "Gregory");
	//		List<Guide> guides = query.getResultList();
	//		for (Guide gu : guides) System.out.println(gu);
			
	//		Query query = em.createQuery("select guide from Guide as guide where guide.name=:name");
	//		Guide guide = (Guide) query.setParameter("name", "Kyril").getSingleResult();
	//		System.out.println(guide);
			
	//		Query query = em.createQuery("select guide from Guide as guide where guide.name like 'K%'");
	//		List<Guide> guides = query.getResultList();
	//		for (Guide gu : guides) System.out.println(gu);
			
	//		Query query = em.createNativeQuery("select * from Student", Student.class);
	//		List<Student> students = query.getResultList();
	//		for (Student st : students) System.out.println(st);
			
	//		List<Guide> guides = (List<Guide>) em.createNamedQuery("findByGuide").setParameter("name", "Gregory").getResultList();
	//		for (Guide gu : guides) System.out.println(gu);
			
	//		Query query = em.createQuery("select count(guide) from Guide as guide");
	//		Long num = (Long) query.getSingleResult();
	//		System.out.println("Number of guides: " + num);
	
	//		Student student = new Student("222222", "Bruce");
	//		em.persist(student);
			
	//		Query query = em.createQuery("select student from Student student join student.guide guide");
	//		List<Student> students = query.getResultList();
	//		for (Student st : students) System.out.println(st);
			
//			Facebooker fb = new Facebooker();
//			fb.setName("Alex");
//			Instagrammer insta = new Instagrammer();
//			insta.setName("Petro");
//			em.persist(fb);
//			em.persist(insta);
			
//			Query query = em.createQuery("select blogger from Blogger blogger");
//			List<Blogger> bloggers = query.getResultList();
//			for (Blogger bl : bloggers)  System.out.println(bl);
			
//			Query query = em.createQuery("select instagrammer from Instagrammer instagrammer");
//			List<Instagrammer> instagrammers = query.getResultList();
//			for (Instagrammer insta : instagrammers)  System.out.println(insta); 
	
			
			txn.commit();
		} catch (Exception ex) {
			if (txn!=null) txn.rollback();
			ex.printStackTrace();
		} finally {
			em.close();
		}
		

	}

}
