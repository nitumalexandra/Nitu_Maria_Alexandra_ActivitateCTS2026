package adapter;

public class MedicamentFarmacie implements IMedicamentFarmacie {

    private String nume;

    public MedicamentFarmacie(String nume) {
        this.nume = nume;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentul " + nume + " a fost cumparat din farmacie fara verificare reteta.");
    }
}