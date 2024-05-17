public class Maison extends Batiment {

    protected int nbPieces;
    protected int surfaceJardin;

    public Maison(String adresse, int surfaceHabitable, int nbPieces, int surfaceJardin) {
        super(adresse, surfaceHabitable);
        this.nbPieces = nbPieces;
        this.surfaceJardin = surfaceJardin;
    }

    public String toString() {
        return super.toString();
    }

}
