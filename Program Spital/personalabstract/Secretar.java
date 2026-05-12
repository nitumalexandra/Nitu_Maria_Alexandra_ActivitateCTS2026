package personalabstract;

public class Secretar extends Personal {

    public Secretar(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Secretar " + nume + " salariu " + salariu);
    }
}