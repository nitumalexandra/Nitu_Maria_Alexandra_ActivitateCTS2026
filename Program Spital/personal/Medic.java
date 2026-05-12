package personal;

public class Medic extends PersonalSpital {

    public Medic(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Medic " + nume + " salariu " + salariu);
    }
}