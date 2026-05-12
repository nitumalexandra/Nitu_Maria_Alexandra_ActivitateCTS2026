package personalabstract;

public class PersonalMedicalMedic extends Personal {

    public PersonalMedicalMedic(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Personal medical medic " + nume + " salariu " + salariu);
    }
}