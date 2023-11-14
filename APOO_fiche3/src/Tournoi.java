public class Tournoi {
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private Club club;

    public Tournoi(String nom, Date dateDebut, Date dateFin, Club club) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.club = club;
    }
    public Tournoi(String nom, Date dateDebut, Date dateFin) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getNom() {
        return nom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public Club getClub() {
        return club;
    }

    @Override
    public String toString() {
        if(club != null)
            return "Le tournoi se nomme "+ nom + " et est organisé par le club "+ club.getNom();
        else{
            return "Le tournoi se nomme "+ nom;
        }
    }
}
