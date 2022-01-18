package bankaprojesi.hibernate;



import org.hibernate.Session;
import org.hibernate.Transaction;

import bankaprojesi.hibernate.dao.KullaniciDao;
import bankaprojesi.hibernate.model.Kullanici;
import bankaprojesi.hibernate.util.HibernateUtil;

public class runner {
public static void main(String[] args) {
	
	KullaniciDao kullaniciDao =  new KullaniciDao();
	Kullanici kullanici = new Kullanici("Abdurrezzak","Kadayif",7863);
	kullaniciDao.saveMusteri(kullanici);
	
	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();



System.out.println(session.createSQLQuery("SELECT * FROM Kullanici WHERE firstname = Abdurrezzak"));

transaction.commit();

}
}