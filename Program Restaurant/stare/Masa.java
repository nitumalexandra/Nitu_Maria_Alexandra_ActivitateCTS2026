package stare;

public class Masa {

    private int nrMasa;
    private StareMasa stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new StareLibera();
    }

    public void setStare(StareMasa stare) {
        this.stare = stare;
    }

    public void rezerva() {
        new StareRezervata().schimbaStare(this);
    }

    public void ocupa() {
        new StareOcupata().schimbaStare(this);
    }

    public void elibereaza() {
        new StareLibera().schimbaStare(this);
    }

    public int getNrMasa() {
        return nrMasa;
    }
}