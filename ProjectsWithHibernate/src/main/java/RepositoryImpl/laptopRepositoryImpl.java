package RepositoryImpl;

import Model.CepTelefonu;
import Model.Laptop;
import Repository.laptopRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class laptopRepositoryImpl implements laptopRepository {

  //  private final HibernateFactory.hibernateFactory hf = new HibernateFactoryImpl.laptopFactoryImpl();


    Session sf = laptohf.getSessionFactory();
    Transaction tr = laptohf.getTranaction();
    Laptop lt;

    @Override
    public void save() {

        tr = sf.beginTransaction();
        sf.save(new Laptop(lt.setFiyat(),lt.setIndirimOrani(),lt.setUrunAdi(),lt.setMarka(),lt.setHafizaBilgisi(),lt.setEkranBoyutu(),lt.setPilGucu(),lt.setRam(),lt.setRenk()));
        tr.commit();

    }

    @Override
    public void update() {

        tr = sf.beginTransaction();
        sf.update(lt.setUrunAdi());
        tr.commit();

    }

    @Override
    public void delete() {
        tr = sf.beginTransaction();
        sf.delete(lt.setUrunAdi());
        tr.commit();
    }
    @Override
    public List findMarka(String sutun) {
        tr = sf.beginTransaction();
        //List list = sf.createQuery("from CepTelefonu ct on marka=sutun").getResultList();
        Query query = sf.createQuery("select lt from Laptop lt where marka= :s");
        query.setParameter("s", sutun);
        //   list.forEach((x) -> System.out.println(Arrays.toString(new CepTelefonu[]{x})));
        return query.getResultList();
    }






}
