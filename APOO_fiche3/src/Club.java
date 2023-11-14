public class Club {
    private String matricule;
    private String nom;
    private Adresse adresse;
    private Joueur directeur;

    public Club(String matricule, String nom, Adresse adresse) {
        this.matricule = matricule;
        this.nom = nom;
        this.adresse = adresse;
    }

    public boolean initialiserDirecteur(Joueur directeur) {
        if(directeur.getClub() == this) {
            this.directeur = directeur;
            return true;
        }
        return false;
    }

    public boolean suppressionDirecteur() {
        if(directeur == null)
            return false;
        directeur = null;
        return true;
    }

    @Override
    public String toString() {
        return this.nom + " (" + this.matricule + ")";
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Joueur getDirecteur() {
        return directeur;
    }
}
