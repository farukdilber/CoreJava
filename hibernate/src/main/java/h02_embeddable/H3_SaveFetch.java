package h02_embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h01_anotasyonlar.H1_Sehir;

public class H3_SaveFetch {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(H1_Ogrenci.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		H2_Dersler ders1 = new H2_Dersler("MUZIK", "MATEMATIK");
		H1_Ogrenci ogrenci1 = new H1_Ogrenci(111, "islam gunduz", 100, ders1);
		session.save(ogrenci1);
		H1_Ogrenci ogrenci2 = new H1_Ogrenci(222, "kursat turgut", 100, new H2_Dersler("BEDEN", "FIZIK"));
		session.save(ogrenci2);
		
		
		
		
		
		
		
		
		
		tx.commit();
}
}