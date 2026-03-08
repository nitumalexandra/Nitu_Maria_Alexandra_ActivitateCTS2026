package supe;

public class FactSupa {

    public Supa getSupa(TipSupa tip, float pret, String ingr) {
        switch (tip) {
            case LEG:
                return new SupaLeg(pret, ingr);
            case CIUP:
                return new SupaCiup(pret, ingr);
            case VITA:
                return new SupaVita(pret, ingr);
            default:
                return null;
        }
    }
}