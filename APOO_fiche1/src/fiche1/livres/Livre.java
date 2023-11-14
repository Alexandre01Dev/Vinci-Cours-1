package fiche1.livres;

public class Livre {
    public String isbn;
    public String titre;
    public String nomAuteur;
    public int nombrePages;
    public int anneeDEdition;
    public double prixConseille;

    public Livre(String isbn, String titre, String nomAuteur, int nombrePages, int anneeDEdition, int prixConseille){
        this.isbn = isbn;
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.nombrePages = nombrePages;
        this.anneeDEdition = anneeDEdition;
        this.prixConseille = prixConseille;
    }

    public String toString(){
        return "Livre: " + this.titre + " de " + this.nomAuteur + " (" + this.anneeDEdition + ")"+ " ISBN: " + this.isbn + " Nombre de pages: " + this.nombrePages+ " Prix conseillé: " + this.prixConseille;
    }
}
