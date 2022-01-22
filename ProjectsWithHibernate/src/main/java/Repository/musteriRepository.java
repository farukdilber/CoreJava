package Repository;

import Model.Musteri;

public interface musteriRepository {

    final HibernateFactory.hibernateFactory musterihf = new HibernateFactoryImpl.laptopFactoryImpl();

    void save();

    void update(Musteri musteri);

    void delete(Musteri musteri);

    String find();


}
