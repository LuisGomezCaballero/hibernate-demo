package com.luisgomezcaballero.data;

import java.util.Date;

import org.hibernate.Session;

import com.luisgomezcaballero.data.entity.MyTable;

public class HibernateDemo {

	public static void main(String[] args) {

		Session session = Util.getSessionFactory().openSession();
		session.getTransaction().begin();

		MyTable myTable = new MyTable();
		myTable.setMyString("test1");
		myTable.setMyDate(new Date());
		myTable.setMyFloat(new Float("1.25"));
		
		session.save(myTable);
		session.getTransaction().commit();
		session.close();
	}

}
