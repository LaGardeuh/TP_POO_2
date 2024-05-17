
public class Compte {
    private int montant;
    private int numero;
    private String proprietaire;

    // Constructeur de la classe Compte
    public Compte(String proprietaire, int numero, int montant) {
        this.proprietaire = proprietaire;
        this.numero = numero;
        this.montant = montant;
    }

    public void modifier(int somme) {
        if (this.montant + somme > 0)
            this.montant = this.montant + somme;
    }

    public int getMontant() {
        return this.montant;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public String toString() {
        return "Compte numero " + this.numero +
                " : proprietaire " + this.proprietaire +
                ", montant " + this.montant;
    }
}