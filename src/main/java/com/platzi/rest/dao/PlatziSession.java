package com.platzi.rest.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PlatziSession {
	
	private Session session;

	public PlatziSession() {
        Configuration configuration = new Configuration();
        configuration.configure(); //lee el archivo de configuracion hibernate.cfg.xml automaticamente de la carpeta resource
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
	}

	public Session getSession() {
        return session;
	}
}
