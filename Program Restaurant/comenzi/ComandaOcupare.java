package comenzi;

public class ComandaOcupare implements Comanda {

    private Masa masa;

    public ComandaOcupare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.ocupa();
    }
}