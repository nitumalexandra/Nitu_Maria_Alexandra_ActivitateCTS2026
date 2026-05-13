package adapter;

public class MedicamentSpital {

    private String nume;

    public MedicamentSpital(String nume) {
        this.nume = nume;
    }

    public void prezintaReteta() {
        System.out.println("Reteta verificata pentru " + nume);
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + nume + " a fost achizitionat din spital.");
    }
}