package Runner;

import RepositoryImpl.cepTelefonuRepositoryImpl;

public class Test {

    public static void main(String[] args) {


        cepTelefonuRepositoryImpl repository = new cepTelefonuRepositoryImpl();
        //System.out.println(repository.findMarka("apple"));
        String marka = CepTelefonuIslemler.TelefonMarkalar[CepTelefonuIslemler.telMarkaSecim];
        System.out.println(repository.findMarka(marka));



    }
}
