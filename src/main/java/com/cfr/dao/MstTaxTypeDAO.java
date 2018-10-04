package com.cfr.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cfr.model.MstTaxType;
import com.cfr.model.TrnInvoice;
import com.util.JPAConn;

@Repository
public class MstTaxTypeDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager em;
	private static EntityTransaction tx;
	
	public void saveTaxType(MstTaxType voMstTaxType) {
		System.out.println("saveTaxType  "+voMstTaxType.toString());
		JPAConn jpaConn = new JPAConn();
		jpaConn.doSave(voMstTaxType);
		jpaConn.doCommit();
		jpaConn.doDisconnect();
	}
	
	public TrnInvoice getTaxType() {
		String sql = "SELECT * FROM TRN_INVOICE WHERE HBN_CODE=201808152321210690942444 ";
		JPAConn jpaConn = new JPAConn();
		TrnInvoice voTax = jpaConn.getSingle(sql);
		return voTax;
	}

}
