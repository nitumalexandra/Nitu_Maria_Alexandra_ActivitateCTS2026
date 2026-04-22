package rezervare;

import clienti.Client;

public class Rezervare {

    private Client client;
    private boolean geam;
    private boolean scaun;
    private boolean decor;
    private boolean muzica;
    private int nrPersoane;

    public Rezervare(Client client, boolean geam, boolean scaun, boolean decor, boolean muzica, int nrPersoane) {
        this.client = client;
        this.geam = geam;
        this.scaun = scaun;
        this.decor = decor;
        this.muzica = muzica;
        if (nrPersoane < 4) {
            throw new IllegalArgumentException("Numarul de persoane trebuie sa fie minim 4.");
        }
        this.nrPersoane = nrPersoane;
    }

    public boolean confirmare() {
        if (nrPersoane < 4) {
            System.out.println("Rezervare imposibila. Va rugam sa veniti pentru o masa de 2 persoane.");
            return false;
        } else {
            System.out.println("Rezervare confirmata pentru " + client + " cu " + nrPersoane + " persoane.");
            return true;
        }
    }

    @Override
    public String toString() {
        return "Rezervare " + client + " geam=" + geam + " scaun=" + scaun + " decor=" + decor + " muzica=" + muzica + " nrPersoane=" + nrPersoane;
    }
}