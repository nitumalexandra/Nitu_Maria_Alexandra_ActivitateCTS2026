package ocupare;

public abstract class OcupareMasa {

    public final void ocupaMasa() {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }

    protected abstract void curataMasa();

    protected abstract void aseazaServetele();

    protected abstract void aseazaTacamuri();

    protected abstract void invitaPersoane();
}