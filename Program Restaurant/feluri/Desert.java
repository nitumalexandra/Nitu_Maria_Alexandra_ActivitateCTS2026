package feluri;

public class Desert extends FelMancare {

    public Desert(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afis() {
        System.out.println("Desert " + denumire + " pret " + pret);
    }
}