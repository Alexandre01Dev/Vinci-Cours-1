public class Article {
    private String reference;
    private String nom;
    private String description;
    private double prixHTVA;
    private double tauxTVA;


    public Article(String reference, String nom, String description, double prixHTVA) {
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHTVA = prixHTVA;
        this.tauxTVA = 21;
    }

    public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA) {
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHTVA = prixHTVA;
        this.tauxTVA = tauxTVA;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrixHTVA() {
        return prixHTVA;
    }

    public void setPrixHTVA(double prixHTVA) {
        this.prixHTVA = prixHTVA;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public double calculerPrixTVAComprise(){
        return (1+(tauxTVA/100)) * prixHTVA;
    }

    public double calculerPrixTVAComprise(int reduction){
        return calculerPrixTVAComprise()* (1 - (double) reduction /100);
    }

    @Override
    public String toString() {
        return nom+"\nréférence: "+reference;
    }
}
