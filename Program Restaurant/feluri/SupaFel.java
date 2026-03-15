package feluri;

public class SupaFel extends FelMancare {

    public SupaFel(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afis() {
        System.out.println("Supa " + denumire + " pret " + pret);
    }
}