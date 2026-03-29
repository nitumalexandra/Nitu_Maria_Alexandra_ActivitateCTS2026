package program;

import supe.*;
import rezervare.*;
import feluri.*;
import clienti.*;
import adapter.*;
import facade.*;

public class Program {

    public static void main(String[] args) {

        FactSupa f = new FactSupa();

        Supa s1 = f.getSupa(TipSupa.LEG, 12.5f, "morcov");
        Supa s2 = f.getSupa(TipSupa.CIUP, 15f, "hribi");
        Supa s3 = f.getSupa(TipSupa.VITA, 18f, "carne");

        s1.afis();
        s2.afis();
        s3.afis();

        Rezervare r1 = new BuilderRezervare("Ana")
                .setGeam(true)
                .setDecor(true)
                .build();

        Rezervare r2 = new BuilderRezervare("Ion")
                .setScaun(true)
                .setMuzica(true)
                .build();

        System.out.println(r1);
        System.out.println(r2);

        FactoryFelMancare factory = new FactoryFelMancare();

        FelMancare f1 = factory.creareFel(TipFelMancare.SUPA, 20, "Rosii");
        FelMancare f2 = factory.creareFel(TipFelMancare.DESERT, 25, "Papanasi");

        f1.afis();
        f2.afis();

        Client c1 = new Client("Ana", "0711111111", "ana@gmail.com", "Bucuresti");
        Client c2 = (Client) c1.copiaza();

        System.out.println(c1);
        System.out.println(c2);

        SoftPrintareBucatarie softVechi = new SoftPrintareBucatarie();
        ISoftBar softNou = new AdapterBarPrintare(softVechi);
        softNou.printeazaNota(45.5f);

        FacadeRestaurant facade = new FacadeRestaurant();
        boolean rezultat = facade.verificaMasa(3);
        System.out.println("Masa pregatita: " + rezultat);
    }
}