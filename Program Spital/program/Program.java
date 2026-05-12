package program;

import pacient.*;
import personal.*;
import personalabstract.*;
import retete.*;

public class Program {

    public static void main(String[] args) {

        Pacient p1 = new Pacient.BuilderPacient("Ana")
                .setPat(true)
                .setMicDejun(true)
                .build();

        Pacient p2 = new Pacient.BuilderPacient("Ion")
                .setPapuci(true)
                .setHalat(true)
                .build();

        System.out.println(p1);
        System.out.println(p2);

        FactoryPersonal factory = new FactoryPersonal();

        PersonalSpital ps1 = factory.crearePersonal(TipPersonal.BRANCARDIER, "Mihai", 3000);
        PersonalSpital ps2 = factory.crearePersonal(TipPersonal.ASISTENT, "Maria", 4500);
        PersonalSpital ps3 = factory.crearePersonal(TipPersonal.MEDIC, "Andrei", 9000);

        ps1.afisare();
        ps2.afisare();
        ps3.afisare();

        FactoryCategorie factoryMedical = new FactoryMedical();
        FactoryCategorie factoryNonMedical = new FactoryNonMedical();

        Personal pm1 = factoryMedical.crearePersonal(TipCategorie.MEDIC, "George", 10000);
        Personal pm2 = factoryMedical.crearePersonal(TipCategorie.ASISTENT, "Elena", 5000);
        Personal pn1 = factoryNonMedical.crearePersonal(TipCategorie.SECRETAR, "Diana", 3500);
        Personal pn2 = factoryNonMedical.crearePersonal(TipCategorie.REGISTRATOR, "Radu", 3200);

        pm1.afisare();
        pm2.afisare();
        pn1.afisare();
        pn2.afisare();

        Reteta r1 = new Reteta("Paracetamol", 10.5f, 20.3f, 5.7f);
        Reteta r2 = (Reteta) r1.copiaza();

        System.out.println(r1);
        System.out.println(r2);
    }
}