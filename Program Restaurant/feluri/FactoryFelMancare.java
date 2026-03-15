package feluri;

public class FactoryFelMancare {

    public FelMancare creareFel(TipFelMancare tip, float pret, String denumire) {

        switch (tip) {

            case SUPA:
                return new SupaFel(pret, denumire);

            case DESERT:
                return new Desert(pret, denumire);

            default:
                return null;
        }
    }
}