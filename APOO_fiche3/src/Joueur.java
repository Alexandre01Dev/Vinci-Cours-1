

public class Joueur {
    String matricule;
    String nom;
    String prenom;
    Date dateNaissance;
    Club club;
    int elo;
    int nbParties;

    public Joueur(String matricule, String nom, String prenom, Date dateNaissance, Club club, int elo, int nbParties) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.club = club;
        this.elo = elo;
        this.nbParties = nbParties;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public Club getClub() {
        return club;
    }

    public int getElo() {
        return elo;
    }

    public int getNbParties() {
        return nbParties;
    }

    public void incrementerParties() {
        nbParties++;
    }

    public boolean changeElo(int elo) {
        if (elo > 0) {
            this.elo = elo;
            return true;
        }
        return false;
    }

    public boolean changeClub(Club club) {
        if (club != null) {
            this.club = club;
            return true;
        }
        return false;
    }

    public String toString() {
       return "Le joueur concerné s'appelle "+ nom;
    }
}
