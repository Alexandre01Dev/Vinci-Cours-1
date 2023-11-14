package fiche2;



public class Personne {
    private String nom;
    private String prenom;
    public Date date;


    private Adresse adresse;

    public Personne(String nom, String prenom, Date date, Adresse adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.adresse = adresse;
    }

    public void demenager(String rue, String numero, String ville, String codePostal){
        this.adresse = new Adresse(rue, numero, ville, codePostal);
    }

    public Adresse fournirDomicle(){
        return this.adresse;
    }

    public int calculerAge(){
        return 2023-this.date.getAnnee();
    }

    public int calculerAgeEn(int annee){
        return annee-this.date.getAnnee();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
