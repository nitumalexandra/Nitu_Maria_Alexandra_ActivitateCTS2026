package spital;

public class Vizitator {

    private String nume;
    private boolean areScrisoare;

    public Vizitator(String nume, boolean areScrisoare) {
        this.nume = nume;
        this.areScrisoare = areScrisoare;
    }

    public String getNume() {
        return nume;
    }

    public boolean areScrisoare() {
        return areScrisoare;
    }
}