package personal;

public abstract class PersonalSpital {

    protected String nume;
    protected float salariu;

    public PersonalSpital(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public abstract void afisare();
}