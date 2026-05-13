package adapter;

public class AdapterMedicament implements IMedicamentFarmacie {

    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}