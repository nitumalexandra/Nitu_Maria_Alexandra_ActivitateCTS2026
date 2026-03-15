package feluri;

public abstract class FelMancare {

    protected float pret;
    protected String denumire;

    public FelMancare(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public abstract void afis();
}