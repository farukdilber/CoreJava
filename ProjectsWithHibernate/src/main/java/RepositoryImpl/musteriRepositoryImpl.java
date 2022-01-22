package RepositoryImpl;

import Model.Musteri;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.Query;

public class musteriRepositoryImpl implements Repository.musteriRepository{

    Session sf = musterihf.getSessionFactory();
    Transaction tr = musterihf.getTranaction();
    Model.Musteri musteri;

    @Override
    public void save() {
        tr = sf.beginTransaction();
        musteri  = new Musteri(musteri.setIsim(), musteri.setTel(), musteri.setEmail(), musteri.setKrediKarti());
        sf.save(musteri);
        tr.commit();
    }

    @Override
    public void update(Musteri musteri) {
        tr = sf.beginTransaction();
        sf.update(musteri);
        tr.commit();
    }

    @Override
    public void delete(Musteri musteri) {
        tr = sf.beginTransaction();
        sf.delete(musteri);
        tr.commit();
    }

    @Override
    public String find() {
        tr = sf.beginTransaction();
        Query query = sf.createQuery("select m from Muster m");
       // query.setParameter("ad", ad);
        query.getSingleResult().toString();
        tr.commit();
        return query.getSingleResult().toString();
    }
}
