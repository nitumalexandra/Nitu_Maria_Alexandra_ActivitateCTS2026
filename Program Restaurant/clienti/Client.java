package clienti;

import plata.ModPlata;

import java.util.HashMap;
import java.util.Map;

public class Client implements IPrototype {
    private String nume;
    private String telefon;
    private String email;
    private String adresa;

    private static Map<String, Client> clientCache = new HashMap<>();

    public Client(String nume, String telefon, String email, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
        this.adresa = adresa;
    }

    @Override
    public IPrototype copiaza() {
        return new Client(nume, telefon, email, adresa);
    }

    @Override
    public String toString() {
        return "Client " + nume + " telefon=" + telefon + " email=" + email + " adresa=" + adresa;
    }

    public static Client getClient(String nume, String telefon, String email, String adresa) {
        String key = nume + telefon + email;
        if (!clientCache.containsKey(key)) {
            Client newClient = new Client(nume, telefon, email, adresa);
            clientCache.put(key, newClient);
        }
        return clientCache.get(key);
    }

    public void efectueazaPlata(float suma, ModPlata modPlata) {
        modPlata.plateste(suma);
    }
}