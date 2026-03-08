package supe;

public class SupaCiup extends Supa {

    public SupaCiup(float pret, String ingr) {
        super(pret, ingr);
    }

    @Override
    public void afis() {
        System.out.println("Supa ciuperci " + pret + " " + ingr);
    }
}