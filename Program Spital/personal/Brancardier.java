package personal;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Brancardier " + nume + " salariu " + salariu);
    }
}