package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
       /* DaoImp dao=new DaoImp();*/
       DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Résultat="+metier.calcul());
    }
}
