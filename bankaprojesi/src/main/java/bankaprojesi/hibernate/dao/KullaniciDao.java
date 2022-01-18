package bankaprojesi.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import bankaprojesi.hibernate.model.Kullanici;
import bankaprojesi.hibernate.util.HibernateUtil;

public class KullaniciDao {

	public void saveMusteri(Kullanici kullanici) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			session.save(kullanici);
			
			transaction.commit();
		}
		catch (Exception e) {
		   if (transaction !=null) {
			transaction.rollback();
		}
		}
	}
	public void updateMusteri(Kullanici kullanici) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			session.saveOrUpdate(kullanici);
			
			transaction.commit();
		}
		catch (Exception e) {
		   if (transaction !=null) {
			transaction.rollback();
		}
		}
	}
	public void getMusteriById(long id) {
		Transaction transaction = null;
		Kullanici kullanici = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			kullanici = session.get(Kullanici.class, id);
			System.out.println(kullanici);
			transaction.commit();
		}
		catch (Exception e) {
		   if (transaction !=null) {
			transaction.rollback();
		}
		}
	}
	@SuppressWarnings("unchecked")
	public List<Kullanici> getAllKullanici() {
		Transaction transaction = null;
		List<Kullanici> kullanici = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			kullanici = session.createQuery("from Kullanici").list();
			
			transaction.commit();
		}
		catch (Exception e) {
		   if (transaction !=null) {
			transaction.rollback();
		}
		}
		return kullanici;
	}
	public void deleteMusteri(long id) {
		Transaction transaction = null;
		Kullanici kullanici = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			kullanici = session.get(Kullanici.class, id);
			session.remove(kullanici);
			
			transaction.commit();
		}
		catch (Exception e) {
		   if (transaction !=null) {
			transaction.rollback();
		}
		}
	}
}
