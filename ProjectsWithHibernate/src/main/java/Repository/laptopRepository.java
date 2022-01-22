package Repository;

import Model.Laptop;

import java.util.List;

public interface laptopRepository {


    final HibernateFactory.hibernateFactory laptohf = new HibernateFactoryImpl.laptopFactoryImpl();

    void save();

    void update();

    void delete();

    List findMarka(String sutun);
}
