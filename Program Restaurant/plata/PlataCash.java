package plata;

public class PlataCash implements ModPlata {

    @Override
    public void plateste(float suma) {
        System.out.println("Plata cash: " + suma + " RON");
    }
}