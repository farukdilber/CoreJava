package HibernateFactoryImpl;

import HibernateFactory.hibernateFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class musteriFactoryImpl implements hibernateFactory {

    private SessionFactory sessionFactory = null;
    private Transaction tr = null;

    @Override
    public Session getSessionFactory() {
        this.sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Model.Musteri.class);
        Session session = sessionFactory.openSession();
        return session;
    }

    @Override
    public Transaction getTranaction() {
        this.tr = getSessionFactory().beginTransaction();
        return tr;
    }
}
