package notificari;

public class NotificatorManager extends Notificator {

    @Override
    public void notifica(ClientNotif client, String mesaj) {
        System.out.println("Manager notificat: clientul " + client.getNume() + " nu are date de contact.");
    }
}