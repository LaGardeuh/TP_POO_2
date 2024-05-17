public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Batiment Batiment1 = new Batiment("92 de la Rue", 25);
        Immeuble Immeuble1 = new Immeuble("94 de la Rue", 210, 3);
        Maison Maison1 = new Maison("96 de la Rue", 60, 3, 300);

        Quartier Quartier1 = new Quartier();

        Quartier1.ajoutBatiment(Batiment1);
        Quartier1.ajoutBatiment(Immeuble1);
        Quartier1.ajoutBatiment(Maison1);

        System.out.println(Batiment1.categorie());
        System.out.println(Immeuble1.categorie());
        System.out.println(Maison1.categorie());
        // Quartier1.afficherAdressesBatiments();
    }
}
