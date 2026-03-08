package supe;

public abstract class Supa {
    protected float pret;
    protected String ingr;

    public Supa(float pret, String ingr) {
        this.pret = pret;
        this.ingr = ingr;
    }

    public abstract void afis();
}