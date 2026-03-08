package program;

import supe.FactSupa;
import supe.Supa;
import supe.TipSupa;

public class Program {

    public static void main(String[] args) {

        FactSupa f = new FactSupa();

        Supa s1 = f.getSupa(TipSupa.LEG, 12.5f, "morcov");
        Supa s2 = f.getSupa(TipSupa.CIUP, 15f, "hribi");
        Supa s3 = f.getSupa(TipSupa.VITA, 18f, "carne");

        s1.afis();
        s2.afis();
        s3.afis();
    }
}