package program;

import supe.*;
import rezervare.*;
import feluri.*;

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
    }
}