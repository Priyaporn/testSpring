package com.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cfr.model.MstTaxType;
import com.cfr.model.TrnInvoice;

public class JPAConn {

	 EntityManagerFactory emfactory;
	 EntityManager entitymanager;
	 
	 public JPAConn() {
	  emfactory = Persistence.createEntityManagerFactory( "sampleSpringWar" );  
	     entitymanager = emfactory.createEntityManager();
	     entitymanager.getTransaction().begin();
	 }
	 
	 public void doCommit(){
	     entitymanager.getTransaction().commit();
	 }
	 
	 public void doRollback(){
	  entitymanager.getTransaction().rollback();
	 }
	 
	 public void doDisconnect(){
	     entitymanager.close();
	     emfactory.close();
	 }
	 
	 public void doSave(MstTaxType dataModel){
	     entitymanager.persist(dataModel);
	 }
	 
	 public TrnInvoice getSingle(String query){
		 Query q = entitymanager.createNativeQuery(query,TrnInvoice.class);
		 //MstTaxType voTax = (MstTaxType) q.getSingleResult();
		 TrnInvoice voTax = (TrnInvoice) q.getSingleResult();
		 return voTax;
	 }

}
