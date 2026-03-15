package rezervare;

public class Rezervare {

    private String nume;
    private boolean geam;
    private boolean scaun;
    private boolean decor;
    private boolean muzica;

    public Rezervare(String nume, boolean geam, boolean scaun, boolean decor, boolean muzica) {
        this.nume = nume;
        this.geam = geam;
        this.scaun = scaun;
        this.decor = decor;
        this.muzica = muzica;
    }

    @Override
    public String toString() {
        return "Rezervare " + nume +
                " geam=" + geam +
                " scaun=" + scaun +
                " decor=" + decor +
                " muzica=" + muzica;
    }
}