package plata;

public class PlataCard implements ModPlata {

    @Override
    public void plateste(float suma) {
        System.out.println("Plata cu cardul: " + suma + " RON");
    }
}