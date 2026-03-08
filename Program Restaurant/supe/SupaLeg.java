package supe;

public class SupaLeg extends Supa {

    public SupaLeg(float pret, String ingr) {
        super(pret, ingr);
    }

    @Override
    public void afis() {
        System.out.println("Supa legume " + pret + " " + ingr);
    }
}