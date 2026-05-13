package decorator;

public class RezultatOnline extends DecoratorRezultat {

    public RezultatOnline(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaRezultat() {
        super.afiseazaRezultat();
        System.out.println("Rezultatul este disponibil si online.");
    }
}