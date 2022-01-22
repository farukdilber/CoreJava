package Repository;

import Model.CepTelefonu;

import java.util.List;

public interface cepTelefonuRepository {

    final HibernateFactory.hibernateFactory ceptelefonuhf = new HibernateFactoryImpl.cepTelefonuFactoryImpl();


    void save();

    void update();

    void delete();

    List<CepTelefonu> findMarka(String s);



}
