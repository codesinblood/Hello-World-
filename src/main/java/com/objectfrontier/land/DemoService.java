package com.objectfrontier.land;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoService {
	
	public String readDemo() {
		
		SessionFactory sf = new Configuration().addAnnotatedClass(DemoPojo.class).buildSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		return s.get(DemoPojo.class, 1).toString();
	}
}
