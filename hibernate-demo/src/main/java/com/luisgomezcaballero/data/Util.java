package com.luisgomezcaballero.data;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.luisgomezcaballero.data.entity.MyTable;

public class Util {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();

		configuration.addAnnotatedClass(MyTable.class);
		
		Properties properties = new Properties();
		properties.put("hibernate.connection.username", "root");
		properties.put("hibernate.connection.password", "");
		properties.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/myDatabase");
		
		configuration.setProperties(properties);
		
		return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
