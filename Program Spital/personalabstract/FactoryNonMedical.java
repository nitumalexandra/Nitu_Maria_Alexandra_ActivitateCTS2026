package personalabstract;

public class FactoryNonMedical implements FactoryCategorie {

    @Override
    public Personal crearePersonal(TipCategorie tip, String nume, float salariu) {
        switch (tip) {
            case SECRETAR:
                return new Secretar(nume, salariu);
            case REGISTRATOR:
                return new Registrator(nume, salariu);
            default:
                return null;
        }
    }
}