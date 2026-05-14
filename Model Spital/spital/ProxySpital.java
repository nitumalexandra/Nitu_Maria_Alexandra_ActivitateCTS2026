package spital;

import java.util.ArrayList;
import java.util.List;

public class ProxySpital implements ISpital {

    private ISpital spital;
    private List<Vizitator> vizitatori;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
        this.vizitatori = new ArrayList<>();
    }

    @Override
    public void permiteAcces(Vizitator vizitator) {
        if (!vizitator.areScrisoare()) {
            System.out.println("Vizitatorul " + vizitator.getNume() + " nu are scrisoare de acceptare.");
            return;
        }

        vizitatori.add(vizitator);
        System.out.println("Vizitatorul " + vizitator.getNume() + " asteapta echiparea.");

        if (vizitatori.size() >= 3) {
            echipeazaVizitatori();
            permiteAccesVizitatori();
            vizitatori.clear();
        }
    }

    private void echipeazaVizitatori() {
        System.out.println("Vizitatorii sunt echipati cu haine de protectie.");
    }

    private void permiteAccesVizitatori() {
        for (Vizitator vizitator : vizitatori) {
            spital.permiteAcces(vizitator);
        }
    }
}