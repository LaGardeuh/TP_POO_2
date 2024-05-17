public class Quartier {
    private Batiment[] batiments;
    private int batMax = 100;
    private int currentBat;

    public Quartier() {
        this.batiments = new Batiment[batMax];
        this.currentBat = 0;
    }

    public void ajoutBatiment(Batiment b) {
        batiments[currentBat] = b;
        currentBat++;
    }

    public void afficherAdressesBatiments(int cat) {
        for (int i = 0; i < currentBat; i++) {
            System.out.println("Adresse: " + batiments[i].getAdresse());
        }
    }
}
