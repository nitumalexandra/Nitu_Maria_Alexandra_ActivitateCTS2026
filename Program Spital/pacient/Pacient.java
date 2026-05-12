package pacient;

public class Pacient {

    private String nume;
    private boolean pat;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    private Pacient(String nume, boolean pat, boolean micDejun, boolean papuci, boolean halat) {
        this.nume = nume;
        this.pat = pat;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
    }

    @Override
    public String toString() {
        return "Pacient " + nume +
                " pat=" + pat +
                " micDejun=" + micDejun +
                " papuci=" + papuci +
                " halat=" + halat;
    }

    public static class BuilderPacient {
        private String nume;
        private boolean pat;
        private boolean micDejun;
        private boolean papuci;
        private boolean halat;

        public BuilderPacient(String nume) {
            this.nume = nume;
            this.pat = false;
            this.micDejun = false;
            this.papuci = false;
            this.halat = false;
        }

        public BuilderPacient setPat(boolean pat) {
            this.pat = pat;
            return this;
        }

        public BuilderPacient setMicDejun(boolean micDejun) {
            this.micDejun = micDejun;
            return this;
        }

        public BuilderPacient setPapuci(boolean papuci) {
            this.papuci = papuci;
            return this;
        }

        public BuilderPacient setHalat(boolean halat) {
            this.halat = halat;
            return this;
        }

        public Pacient build() {
            return new Pacient(nume, pat, micDejun, papuci, halat);
        }
    }
}