package notificari;

public class ClientFidel implements Observer {

    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul " + nume + " a primit notificarea: " + mesaj);
    }
}