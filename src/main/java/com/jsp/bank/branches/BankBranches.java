package com.jsp.bank.branches;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankBranches {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Bank bank=new Bank();
	bank.setName("SBI");
	
	
	Branch branch1=new Branch();
	branch1.setAddress("Nerul");
	
	Branch branch2=new Branch();
	branch2.setAddress("VASHI");
	
	Branch branch3=new Branch();
	branch3.setAddress("KHARGHAR");
	
	Branch branch4=new Branch();
	branch4.setAddress("PEN");
	
	Branch branch5=new Branch();
	branch5.setAddress("BELAPUR");
	
	List<Branch> branches=new ArrayList<Branch>();
	branches.add(branch1);
	branches.add(branch2);
	branches.add(branch3);
	branches.add(branch4);
	branches.add(branch5);

	bank.setBranches(branches);
	
	branch1.setBank(bank);
	branch2.setBank(bank);
	branch3.setBank(bank);
	branch4.setBank(bank);
	branch5.setBank(bank);

	


entityTransaction.begin();
entityManager.persist(bank);
entityManager.persist(branch1);
entityManager.persist(branch2);
entityManager.persist(branch3);
entityManager.persist(branch4);
entityManager.persist(branch5);
entityTransaction.commit();


}
}
