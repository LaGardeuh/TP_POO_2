public class Immeuble extends Batiment {
    protected int nbAppart;

    public Immeuble(String adresse, int surfaceHabitable, int nbAppart) {
        super(adresse, surfaceHabitable);
        this.nbAppart = nbAppart;
    }

    public String toString() {
        return super.toString();
    }

}
