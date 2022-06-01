
package main;

import modell.KincsesLada;
import modell.Terem;


public class KincsKeresesProgram {

    
    public static void main(String[] args) {
        Terem teszt = new Terem();
        KincsesLada[] ladak = teszt.getKincsesLadak();
        System.out.println("Első láda:");
        System.out.println(ladak[0].getFelirat());
        System.out.println(ladak[0].getTartalom());
        System.out.println(ladak[0].getTipus());

        System.out.println("-----------------------");
        System.out.println("Második láda:");
        System.out.println(ladak[1].getFelirat());
        System.out.println(ladak[1].getTartalom());
        System.out.println(ladak[1].getTipus());

        System.out.println("-----------------------");
        System.out.println("Harmadik láda:");
        System.out.println(ladak[2].getFelirat());
        System.out.println(ladak[2].getTartalom());
        System.out.println(ladak[2].getTipus());

    }
    
}
