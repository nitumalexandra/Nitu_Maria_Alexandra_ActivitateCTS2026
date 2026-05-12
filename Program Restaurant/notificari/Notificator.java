package notificari;

public abstract class Notificator {

    protected Notificator urmator;

    public void setUrmator(Notificator urmator) {
        this.urmator = urmator;
    }

    public abstract void notifica(ClientNotif client, String mesaj);
}