package program;

import spital.*;

public class Program {

    public static void main(String[] args) {

        ISpital spital = new Spital();
        ISpital proxySpital = new ProxySpital(spital);

        Vizitator v1 = new Vizitator("Ana", true);
        Vizitator v2 = new Vizitator("Ion", true);
        Vizitator v3 = new Vizitator("Maria", true);
        Vizitator v4 = new Vizitator("George", false);

        proxySpital.permiteAcces(v1);
        proxySpital.permiteAcces(v2);
        proxySpital.permiteAcces(v3);
        proxySpital.permiteAcces(v4);
    }
}