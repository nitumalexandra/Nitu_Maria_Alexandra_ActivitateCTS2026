package personal;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Asistent " + nume + " salariu " + salariu);
    }
}