package facade;

public class MedicInternare {

    public boolean confirmaInternare(PacientInternare pacient) {
        System.out.println("Medicul verifica pacientul " + pacient.getNume());
        return pacient.areStareGrava();
    }
}