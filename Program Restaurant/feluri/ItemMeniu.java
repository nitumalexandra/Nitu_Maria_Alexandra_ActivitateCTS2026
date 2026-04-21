package feluri;

public class ItemMeniu {
    private String nume;
    private float pret;

    public ItemMeniu(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void afisare() {
        System.out.println("Item: " + nume + " - Pret: " + pret + " RON");
    }
}