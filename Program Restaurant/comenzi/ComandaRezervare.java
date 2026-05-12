package comenzi;

public class ComandaRezervare implements Comanda {

    private Masa masa;

    public ComandaRezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.rezerva();
    }
}