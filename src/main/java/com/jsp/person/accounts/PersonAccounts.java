package com.jsp.person.accounts;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonAccounts {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("Bappa");
		person.setEmail("bappa@mail.com");
		person.setCno(902302220);
		
		
		Account account1=new Account();
		account1.setName("SBI");
		account1.setBranch("Nerul");
		
		Account account2=new Account();
		account1.setName("HDFC");
		account1.setBranch("Vashi");
		
		Account account3=new Account();
		account3.setName("MAHARASHTRA");
		account3.setBranch("Mumbai");
		
		Account account4=new Account();
		account4.setName("SBI");
		account4.setBranch("Panvel");
		
		List<Account> accounts= new ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		
		person.setAccounts(accounts);
		
		account1.setPerson(person);
		account2.setPerson(person);
		account3.setPerson(person);
		account4.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();



		
		
		
	}

}
