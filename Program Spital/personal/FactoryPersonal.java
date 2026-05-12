package personal;

public class FactoryPersonal {

    public PersonalSpital crearePersonal(TipPersonal tip, String nume, float salariu) {
        switch (tip) {
            case BRANCARDIER:
                return new Brancardier(nume, salariu);
            case ASISTENT:
                return new Asistent(nume, salariu);
            case MEDIC:
                return new Medic(nume, salariu);
            default:
                return null;
        }
    }
}