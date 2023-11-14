package fiche1;

public class Rectangle {
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getPerimetre(){
        return 2 * (this.longueur + this.largeur);
    }

    public double getAire(){
        return this.longueur * this.largeur;
    }

    @Override
    public String toString() {
        return "Le rectangle a une longueur de " + this.longueur + " et une largeur de " + this.largeur + " !";
    }
}
