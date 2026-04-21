package feluri;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu {
    private String nume;
    private List<Object> subsectiuniSiIteme;

    public SectiuneMeniu(String nume) {
        this.nume = nume;
        this.subsectiuniSiIteme = new ArrayList<>();
    }

    public void adaugaSubsectiune(Object subsectiune) {
        subsectiuniSiIteme.add(subsectiune);
    }

    public void afisare() {
        System.out.println("Sectiune: " + nume);
        for (Object subsectiune : subsectiuniSiIteme) {
            if (subsectiune instanceof ItemMeniu) {
                ((ItemMeniu) subsectiune).afisare();
            } else if (subsectiune instanceof SectiuneMeniu) {
                ((SectiuneMeniu) subsectiune).afisare();
            }
        }
    }
}