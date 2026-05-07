package stare;

public class StareLibera implements StareMasa {

    @Override
    public void schimbaStare(Masa masa) {
        masa.setStare(this);
        System.out.println("Masa " + masa.getNrMasa() + " este libera.");
    }
}