package program;

import supe.*;
import rezervare.*;
import feluri.*;
import clienti.*;
import adapter.*;
import facade.*;
import notificari.*;
import ocupare.*;
import comenzi.*;

public class Program {

    public static void main(String[] args) {

        FactSupa f = new FactSupa();

        Supa s1 = f.getSupa(TipSupa.LEG, 12.5f, "morcov");
        Supa s2 = f.getSupa(TipSupa.CIUP, 15f, "hribi");
        Supa s3 = f.getSupa(TipSupa.VITA, 18f, "carne");

        s1.afis();
        s2.afis();
        s3.afis();

        Client c1 = Client.getClient("Ana", "0711111111", "ana@gmail.com", "Bucuresti");
        Client c2 = Client.getClient("Ion", "0722222222", "ion@gmail.com", "Cluj");

        Rezervare r1 = new Rezervare(c1, true, true, false, true, 4);
        System.out.println(r1);
        r1.confirmare();

        Rezervare r2 = new Rezervare(c2, true, true, true, false, 5);
        System.out.println(r2);
        r2.confirmare();

        FactoryFelMancare factory = new FactoryFelMancare();

        FelMancare f1 = factory.creareFel(TipFelMancare.SUPA, 20, "Rosii");
        FelMancare f2 = factory.creareFel(TipFelMancare.DESERT, 25, "Papanasi");

        f1.afis();
        f2.afis();

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

        Restaurant restaurant = new Restaurant();

        ClientFidel cf1 = new ClientFidel("Ana");
        ClientFidel cf2 = new ClientFidel("Ion");

        restaurant.aboneaza(cf1);
        restaurant.aboneaza(cf2);

        restaurant.notifica("Oferta noua: 20% reducere la deserturi.");
        restaurant.notifica("Meniu nou introdus in restaurant.");

        OcupareMasa ocupare = new OcupareRestaurant();
        ocupare.ocupaMasa();

        Masa masa = new Masa(10);
        Operator operator = new Operator();

        Comanda cRez = new ComandaRezervare(masa);
        Comanda cOcup = new ComandaOcupare(masa);

        operator.trimiteComanda(cRez);
        operator.trimiteComanda(cOcup);

        Notificator sms = new NotificatorSMS();
        Notificator email = new NotificatorEmail();
        Notificator manager = new NotificatorManager();

        sms.setUrmator(email);
        email.setUrmator(manager);

        ClientNotif n1 = new ClientNotif("Ana", "0711111111", "ana@gmail.com");
        ClientNotif n2 = new ClientNotif("Ion", "", "ion@gmail.com");
        ClientNotif n3 = new ClientNotif("Maria", "", "");

        sms.notifica(n1, "Oferta noua la restaurant.");
        sms.notifica(n2, "Oferta noua la restaurant.");
        sms.notifica(n3, "Oferta noua la restaurant.");
    }
}