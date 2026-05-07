package notificari;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Observer> clienti;

    public Restaurant() {
        this.clienti = new ArrayList<>();
    }

    public void aboneaza(Observer client) {
        clienti.add(client);
    }

    public void dezaboneaza(Observer client) {
        clienti.remove(client);
    }

    public void notifica(String mesaj) {
        for (Observer client : clienti) {
            client.primesteNotificare(mesaj);
        }
    }
}