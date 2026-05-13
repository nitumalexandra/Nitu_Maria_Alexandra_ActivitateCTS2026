package decorator;

public abstract class DecoratorRezultat implements IRezultat {

    protected IRezultat rezultat;

    public DecoratorRezultat(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void afiseazaRezultat() {
        rezultat.afiseazaRezultat();
    }
}