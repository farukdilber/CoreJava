package h03_OneToOne;



import java.util.Arrays;
import java.util.List;

import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(H1_Kisi.class)
				.addAnnotatedClass(H2_Gunluk.class);

SessionFactory sf = con.buildSessionFactory();
Session session = sf.openSession();

Transaction tx = session.beginTransaction();

// id=101 olan kisi bilgilerini getir
System.out.println("1.soru" +session.get(H1_Kisi.class, 101));
// id=12 olan gunlugun bilgilerini getir
System.out.println("2.soru" +session.get(H2_Gunluk.class, 12));

 
List<Object[]>liste = session.createQuery("from H1_Kisi k JOIN H2_Gunluk g ON k,kisiId=g.kisi").getResultList();
liste.forEach((x)-> System.out.println(x));


tx.commit();
	}

}
