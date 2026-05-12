package notificari;

public class NotificatorSMS extends Notificator {

    @Override
    public void notifica(ClientNotif client, String mesaj) {
        if (client.getTelefon() != null && !client.getTelefon().isEmpty()) {
            System.out.println("SMS catre " + client.getNume() + ": " + mesaj);
        } else if (urmator != null) {
            urmator.notifica(client, mesaj);
        }
    }
}