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

        Rezervare r1 = new Rezervare("Ana", true, true, false, true, 4);  // Se va confirma
        System.out.println(r1);
        r1.confirmare();

        Rezervare r2 = new Rezervare("Ion", true, true, true, false, 5); // Se va confirma
        System.out.println(r2);
        r2.confirmare();

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

        NotaDePlata nota = new NotaDePlata("Ana", 100.5f);
        nota.afisare();

        SectiuneMeniu startere = new SectiuneMeniu("Startere");
        startere.adaugaSubsectiune(new ItemMeniu("Supa de legume", 15.5f));
        startere.adaugaSubsectiune(new ItemMeniu("Supa de pui", 17f));

        SectiuneMeniu deserturi = new SectiuneMeniu("Deserturi");
        deserturi.adaugaSubsectiune(new ItemMeniu("Papanasi", 20f));
        deserturi.adaugaSubsectiune(new ItemMeniu("Cheesecake", 22f));

        SectiuneMeniu meniu = new SectiuneMeniu("Meniu Restaurant");
        meniu.adaugaSubsectiune(startere);
        meniu.adaugaSubsectiune(deserturi);

        meniu.afisare();
    }
}