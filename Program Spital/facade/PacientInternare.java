package facade;

public class PacientInternare {

    private String nume;
    private boolean stareGrava;

    public PacientInternare(String nume, boolean stareGrava) {
        this.nume = nume;
        this.stareGrava = stareGrava;
    }

    public boolean areStareGrava() {
        return stareGrava;
    }

    public String getNume() {
        return nume;
    }
}