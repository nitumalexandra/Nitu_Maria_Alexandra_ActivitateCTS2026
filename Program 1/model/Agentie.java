package model;

public class Agentie {

    private String nume;
    private float cap;
    private int nr;

    private static Agentie inst;

    private Agentie(String nume, float cap, int nr) {
        this.nume = nume;
        this.cap = cap;
        this.nr = nr;
    }

    public static Agentie getInst(String nume, float cap, int nr) {
        if (inst == null) {
            inst = new Agentie(nume, cap, nr);
        }
        return inst;
    }

    public String getNume() {
        return nume;
    }
}