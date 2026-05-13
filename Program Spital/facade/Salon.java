package facade;

public class Salon {

    private int paturiLibere;

    public Salon(int paturiLibere) {
        this.paturiLibere = paturiLibere;
    }

    public boolean arePatLiber() {
        System.out.println("Se verifica daca exista pat liber.");
        return paturiLibere > 0;
    }
}