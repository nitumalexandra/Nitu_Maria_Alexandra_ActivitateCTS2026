package rezervare;

public class BuilderRezervare {

    private String nume;
    private boolean geam;
    private boolean scaun;
    private boolean decor;
    private boolean muzica;

    public BuilderRezervare(String nume) {
        this.nume = nume;
        this.geam = false;
        this.scaun = false;
        this.decor = false;
        this.muzica = false;
    }

    public BuilderRezervare setGeam(boolean geam) {
        this.geam = geam;
        return this;
    }

    public BuilderRezervare setScaun(boolean scaun) {
        this.scaun = scaun;
        return this;
    }

    public BuilderRezervare setDecor(boolean decor) {
        this.decor = decor;
        return this;
    }

    public BuilderRezervare setMuzica(boolean muzica) {
        this.muzica = muzica;
        return this;
    }

    public Rezervare build() {
        return new Rezervare(nume, geam, scaun, decor, muzica);
    }
}