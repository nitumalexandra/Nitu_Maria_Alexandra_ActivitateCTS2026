package notificari;

public class NotificatorEmail extends Notificator {

    @Override
    public void notifica(ClientNotif client, String mesaj) {
        if (client.getEmail() != null && !client.getEmail().isEmpty()) {
            System.out.println("Email catre " + client.getNume() + ": " + mesaj);
        } else if (urmator != null) {
            urmator.notifica(client, mesaj);
        }
    }
}