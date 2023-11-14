package fiche2;

public class CompteEnBanque {
    Personne titulaire;
    double solde;
    Date dateOuverture;
    Date validiteCarteID;
    String numero;

    public CompteEnBanque(Personne titulaire, double solde, Date dateOuverture, Date validiteCarteID, String numero) {
        this.titulaire = titulaire;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
        this.validiteCarteID = validiteCarteID;
        this.numero = numero;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public Date getValiditeCarteID() {
        return validiteCarteID;
    }

    public void setValiditeCarteID(Date validiteCarteID) {
        this.validiteCarteID = validiteCarteID;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void modifierValiditeCarteID(int jour, int mois, int annee){
        this.validiteCarteID.setJour(jour);
        this.validiteCarteID.setMois(mois);
        this.validiteCarteID.setAnnee(annee);
    }

    public boolean retraitSolde(double montant){
        if(this.solde < montant){
            return false;
        }
        this.solde -= montant;
        return true;
    }

    public boolean depotSolde(double montant){
        if(montant < 0){
            return false;
        }
        this.solde += montant;
        return true;
    }

    public boolean virement(CompteEnBanque compte, double montant){
         boolean retrait = this.retraitSolde(montant);
         if(!retrait){
             return false;
         }
        compte.solde += montant;
        return true;
    }

    @Override
    public String toString() {
        return "Numero de compte: " + this.numero + "\n" +
                "Nom du titulaire: " + this.titulaire.getNom() + "\n" +
                "Prenom du titulaire: " + this.titulaire.getPrenom() + "\n"
                + "Solde: " + this.solde + "\n";
    }
}
