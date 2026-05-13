package decorator;

public class RezultatPrintat implements IRezultat {

    private String pacient;
    private String rezultat;

    public RezultatPrintat(String pacient, String rezultat) {
        this.pacient = pacient;
        this.rezultat = rezultat;
    }

    @Override
    public void afiseazaRezultat() {
        System.out.println("Rezultat printat pentru " + pacient + ": " + rezultat);
    }
}