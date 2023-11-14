public class LigneDeCommande {
    private Article article;
    private int quantite;

    public LigneDeCommande(Article article){
        this(article,1);
    }

    public LigneDeCommande(Article article, int quantite){
        this.article = article;
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double calculerPrixTVAComprise(){
        return article.calculerPrixTVAComprise() * quantite;
    }

    public String toString(){
        return article.toString() + " x " + quantite + " = " + calculerPrixTVAComprise();
    }
}
