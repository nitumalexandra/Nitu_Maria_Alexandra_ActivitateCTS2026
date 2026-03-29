package facade;

public class FacadeRestaurant {
    private MasaLibera masaLibera;
    private Debarasare debarasare;
    private Servetele servetele;

    public FacadeRestaurant() {
        this.masaLibera = new MasaLibera();
        this.debarasare = new Debarasare();
        this.servetele = new Servetele();
    }

    public boolean verificaMasa(int nrMasa) {
        return masaLibera.verifica(nrMasa) &&
                debarasare.verifica(nrMasa) &&
                servetele.verifica(nrMasa);
    }
}