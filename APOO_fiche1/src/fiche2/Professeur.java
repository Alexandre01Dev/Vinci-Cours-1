package fiche2;

public class Professeur {


    private String date;
    private String nom;
    private String prenom;
    private String instrument;

    public Professeur(String date, String nom, String prenom, String instrument){
        this.date = date;
        this.nom = nom;
        this.prenom = prenom;
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return date + " " + prenom + " " + nom + "\n" +
                "Specialisation : " + instrument;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }


}
