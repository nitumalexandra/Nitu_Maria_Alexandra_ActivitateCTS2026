package retete;

public class Reteta implements IPrototype {

    private String denumire;
    private float solutieA;
    private float solutieB;
    private float solutieC;

    public Reteta(String denumire, float solutieA, float solutieB, float solutieC) {
        this.denumire = denumire;
        this.solutieA = solutieA;
        this.solutieB = solutieB;
        this.solutieC = solutieC;
    }

    @Override
    public IPrototype copiaza() {
        return new Reteta(denumire, solutieA, solutieB, solutieC);
    }

    @Override
    public String toString() {
        return "Reteta " + denumire +
                " solutieA=" + solutieA +
                " solutieB=" + solutieB +
                " solutieC=" + solutieC;
    }
}