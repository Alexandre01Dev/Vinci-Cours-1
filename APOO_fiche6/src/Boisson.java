public class Boisson {
    String nom;
    final double contenance;
    double prix;

    public Boisson(String nom, double contenance, double prix) {
        this.nom = nom;
        this.contenance = contenance;
        this.prix = prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getContenance() {
        return contenance;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return nom + " (" + contenance + " cl) à " + prix + " euros";
    }
}
