package facade;

public class FacadeInternare {

    private MedicInternare medic;
    private Salon salon;

    public FacadeInternare(MedicInternare medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public boolean poateFiInternat(PacientInternare pacient) {
        if (!pacient.areStareGrava()) {
            System.out.println("Pacientul " + pacient.getNume() + " nu are stare grava.");
            return false;
        }

        if (!medic.confirmaInternare(pacient)) {
            System.out.println("Medicul nu confirma internarea.");
            return false;
        }

        if (!salon.arePatLiber()) {
            System.out.println("Nu exista pat liber.");
            return false;
        }

        System.out.println("Pacientul " + pacient.getNume() + " poate fi internat.");
        return true;
    }
}