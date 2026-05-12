package personalabstract;

public abstract class Personal {

    protected String nume;
    protected float salariu;

    public Personal(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public abstract void afisare();
}