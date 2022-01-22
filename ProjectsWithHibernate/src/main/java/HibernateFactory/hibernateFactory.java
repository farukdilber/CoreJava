package HibernateFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public interface hibernateFactory {


     Session getSessionFactory();

     Transaction getTranaction();

}
