package personalabstract;

public class PersonalMedicalAsistent extends Personal {

    public PersonalMedicalAsistent(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Personal medical asistent " + nume + " salariu " + salariu);
    }
}