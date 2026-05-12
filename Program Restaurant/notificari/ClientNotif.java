package notificari;

public class ClientNotif {

    private String nume;
    private String telefon;
    private String email;

    public ClientNotif(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }
}