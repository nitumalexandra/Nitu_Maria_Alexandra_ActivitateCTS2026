package comenzi;

public class Masa {

    private int nr;

    public Masa(int nr) {
        this.nr = nr;
    }

    public void rezerva() {
        System.out.println("Masa " + nr + " a fost rezervata.");
    }

    public void ocupa() {
        System.out.println("Masa " + nr + " a fost ocupata.");
    }
}