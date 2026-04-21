package adapter;

public class AdapterBarPrintare implements ISoftBar {
    private SoftPrintareBucatarie softPrintareBucatarie;

    public AdapterBarPrintare(SoftPrintareBucatarie softPrintareBucatarie) {
        this.softPrintareBucatarie = softPrintareBucatarie;
    }

    @Override
    public void printeazaNota(float suma) {
        softPrintareBucatarie.printeazaFactura(suma);
    }
}