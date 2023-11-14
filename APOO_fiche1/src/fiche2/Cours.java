package fiche2;

public class Cours {
    private String nom;
    private String salle;

    private int nbEleves;
    private Professeur professeur;

    public Cours(String nom, String salle, Professeur professeur){
        this.nom = nom;
        this.salle = salle;
        this.professeur = professeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public int getNbEleves() {
        return nbEleves;
    }

    public void setNbEleves(int nbEleves) {
        this.nbEleves = nbEleves;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public void inscrireAuCours(){
        this.nbEleves++;
    }
    public void desinscrireAuCours(){
        this.nbEleves++;
    }


    @Override
    public String toString() {
        return "Cours de niveau "+ salle+ " donné par "+ professeur.getPrenom() + " "+ professeur.getNom()
                +"\n Nombre d'élèves inscrits : "+ nbEleves+ "\n";
    }
}
