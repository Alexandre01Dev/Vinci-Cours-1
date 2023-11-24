public class Vin extends BoissonAlcoolisee {
    private String cepage;
    private String couleur;
    private String region;
    private String pays;

    public Vin(String nom, double contenance, double prix, double degreAlcool, String cepage, String couleur, String region, String pays) {
        super(nom, contenance, prix, degreAlcool);
        this.cepage = cepage;
        this.couleur = couleur;
        this.region = region;
        this.pays = pays;
    }

    public String getCepage() {
        return cepage;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getRegion() {
        return region;
    }

    public String getPays() {
        return pays;
    }

    @Override
    public String toString() {
        return "Vin "+ couleur + ": "+  super.toString() + "\nCépage : " + cepage + "\nOrigine : " + region + " - " + pays;
    }
}
