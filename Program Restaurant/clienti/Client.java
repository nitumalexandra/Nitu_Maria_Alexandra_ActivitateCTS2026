package clienti;

public class Client implements IPrototype {
    private String nume;
    private String telefon;
    private String email;
    private String adresa;

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
}