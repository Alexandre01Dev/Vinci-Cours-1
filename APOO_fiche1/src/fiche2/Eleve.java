package fiche2;

import java.util.Arrays;

public class Eleve {

    private String nom;
    private String prenom;
    private Cours cours1;
    private Cours cours2;

    private Cours coursComplementaire;

    public Eleve(String nom, String prenom, Cours cours1, Cours cours2){
        this.nom = nom;
        this.prenom = prenom;
        this.cours1 = cours1;
        cours1.inscrireAuCours();
        this.cours2 = cours2;
        cours2.inscrireAuCours();

    }

    public void setCoursComplementaire(Cours cours){
        this.coursComplementaire = cours;
        cours.setNbEleves(cours.getNbEleves()+1);
    }

    @Override
    public String toString() {
        String coursComplementaire = this.coursComplementaire == null ? "aucun" : this.coursComplementaire.getNom();
        return prenom + " " + nom + "\n" +
                "Cours principal : " + cours1.getNom() + " "+ cours2.getNom()+ "\n" +
                "Cours complémentaire : " + coursComplementaire;
    }
}
