package program;

import model.Agentie;

public class Program {

    public static void main(String[] args) {

        Agentie a1 = Agentie.getInst("AgeTur", 1000, 5);
        Agentie a2 = Agentie.getInst("Alta", 10, 2);

        System.out.println(a1.getNume());
        System.out.println(a2.getNume());
    }
}