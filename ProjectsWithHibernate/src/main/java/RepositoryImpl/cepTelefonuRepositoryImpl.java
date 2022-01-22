package RepositoryImpl;

import Model.CepTelefonu;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class cepTelefonuRepositoryImpl implements Repository.cepTelefonuRepository {
   // static String[] TelefonMarkalar = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "Xiaomi"};
  //  private final HibernateFactory.hibernateFactory hf = new HibernateFactoryImpl.cepTelefonuFactoryImpl();

    Session sf = ceptelefonuhf.getSessionFactory();
    Transaction tr = ceptelefonuhf.getTranaction();
    CepTelefonu cp;

    @Override
    public void save() {

        tr = sf.beginTransaction();
        sf.save(new CepTelefonu(cp.setFiyat(),cp.setIndirimOrani(),cp.setUrunAdi(),cp.setMarka(),cp.setHafizaBilgisi(),cp.setEkranBoyutu(),cp.setPilGucu(),cp.setRam(),cp.setRenk()));
        tr.commit();

    }

    @Override
    public void update() {

        tr = sf.beginTransaction();
        sf.update(cp.setUrunAdi());
        tr.commit();

    }

    @Override
    public void delete() {
        tr = sf.beginTransaction();
        sf.delete(cp.setUrunAdi());
        tr.commit();
    }

    @Override
    public List<CepTelefonu> findMarka(String s) {
        tr = sf.beginTransaction();
        //List list = sf.createQuery("from CepTelefonu ct on marka=sutun").getResultList();
        Query query = sf.createQuery("select ct from CepTelefonu ct where marka= :s");
        query.setParameter("s", s);
        //   list.forEach((x) -> System.out.println(Arrays.toString(new CepTelefonu[]{x})));
       // tr.commit();
        return (List<CepTelefonu>) query.getResultList();
    }

}
