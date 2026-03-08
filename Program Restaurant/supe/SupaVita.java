package supe;

public class SupaVita extends Supa {

    public SupaVita(float pret, String ingr) {
        super(pret, ingr);
    }

    @Override
    public void afis() {
        System.out.println("Supa vita " + pret + " " + ingr);
    }
}