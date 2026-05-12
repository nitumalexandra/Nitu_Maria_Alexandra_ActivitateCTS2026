package personalabstract;

public class Registrator extends Personal {

    public Registrator(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Registrator " + nume + " salariu " + salariu);
    }
}