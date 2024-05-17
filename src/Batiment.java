public class Batiment {
    protected String adresse;
    protected int surfaceHabitable;

    public Batiment(String adresse, int surfaceHabitable) {
        this.adresse = adresse;
        this.surfaceHabitable = surfaceHabitable;
    }

    public String toString() {
        return super.toString();
    }

    public String getAdresse() {
        return adresse;
    }

    public int getSurfaceHabitable() {
        return surfaceHabitable;
    }

    public int categorie() {
        if (this.surfaceHabitable > 70) {
            return 3;
        }
        if (this.surfaceHabitable >= 30) {
            return 2;
        } else {
            return 1;
        }
    }

}
