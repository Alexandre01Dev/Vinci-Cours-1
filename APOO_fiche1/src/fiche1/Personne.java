package fiche1;

public class Personne {
    public String nom;
    public String prenom;
    public int mois;
    public int jour;
    public int annee;
    public String adresseRue;
    public String adresseNum;
    public int codePostal;

    public int donnerAgeFinAnneeActuelle(){
        return 2020 - this.annee;
    }

    public int donnerAgeFinAnnee(int annee){
        return annee - this.annee;
    }

    public String donnerAdresseComplete(){
        return this.adresseNum + " " + this.adresseRue + " " + this.codePostal;
    }

    public String donnerDateNaissance(){
        return this.jour + "/" + this.mois + "/" + this.annee;
    }
}
