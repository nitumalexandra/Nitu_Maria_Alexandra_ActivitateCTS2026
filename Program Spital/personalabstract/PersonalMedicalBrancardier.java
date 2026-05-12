package personalabstract;

public class PersonalMedicalBrancardier extends Personal {

    public PersonalMedicalBrancardier(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Personal medical brancardier " + nume + " salariu " + salariu);
    }
}