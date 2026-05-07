package stare;

public class StareRezervata implements StareMasa {

    @Override
    public void schimbaStare(Masa masa) {
        masa.setStare(this);
        System.out.println("Masa " + masa.getNrMasa() + " este rezervata.");
    }
}