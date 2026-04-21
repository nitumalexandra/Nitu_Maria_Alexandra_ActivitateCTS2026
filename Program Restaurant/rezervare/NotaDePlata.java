package rezervare;

public class NotaDePlata {
    private String client;
    private float total;

    public NotaDePlata(String client, float total) {
        this.client = client;
        this.total = total;
    }

    public void afisare() {
        System.out.println("Nota de plata pentru: " + client);
        System.out.println("Total de plata: " + total + " RON");
        System.out.println("Multi ani fericiti, " + client + "!");
    }
}