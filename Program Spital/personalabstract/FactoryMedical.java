package personalabstract;

import personal.Asistent;
import personal.Brancardier;
import personal.Medic;

public class FactoryMedical implements FactoryCategorie {

    @Override
    public Personal crearePersonal(TipCategorie tip, String nume, float salariu) {
        switch (tip) {
            case BRANCARDIER:
                return new PersonalMedicalBrancardier(nume, salariu);
            case ASISTENT:
                return new PersonalMedicalAsistent(nume, salariu);
            case MEDIC:
                return new PersonalMedicalMedic(nume, salariu);
            default:
                return null;
        }
    }
}