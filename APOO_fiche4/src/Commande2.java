import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Commande2 {
	private List<LigneDeCommande> ligneDeCommandes; // ou private List<Article> articles = new ArrayList<>(); directement
	private LocalDate date;

	public Commande2(){
		date = LocalDate.now();
		ligneDeCommandes = new ArrayList<>(); // ou le faire directement dans les attributs
	}

	public double calculerPrixTotal(){
		double prixTotal = 0;
		for (LigneDeCommande ligneDeCommande : ligneDeCommandes) {
			prixTotal += ligneDeCommande.calculerPrixTVAComprise();
		}
		return prixTotal;
	}

	public void ajouterArticle(Article article){
		ajouterArticle(article,1);
	}
	public void ajouterArticle(Article article,int quantite){
		if(estDejaCommande(article)){
			modifierQuantite(article,quantite);
		}
		ligneDeCommandes.add(new LigneDeCommande(article,quantite));
	}


	public void supprimerArticle(Article article){
		for (LigneDeCommande ligneDeCommande : ligneDeCommandes) {
			if (ligneDeCommande.getArticle().equals(article)) {
				ligneDeCommandes.remove(ligneDeCommande);
				return;
			}
		}
	}

	public void modifierQuantite(Article article, int quantite){
		for (LigneDeCommande ligneDeCommande : ligneDeCommandes) {
			if (ligneDeCommande.getArticle().equals(article)) {
				ligneDeCommande.setQuantite(quantite);
				return;
			}
		}
	}

	public boolean estDejaCommande(Article article){
		for (LigneDeCommande ligneDeCommande : ligneDeCommandes){
			if(ligneDeCommande.getArticle().equals(article)){
				return true;
			}
		}
        return false;
    }

	public int nombreArticleCommande(Article article){
		int i = 0;
		for (LigneDeCommande ligneDeCommande : ligneDeCommandes){
			if(ligneDeCommande.getArticle().equals(article)){
				i+= ligneDeCommande.getQuantite();
			}
		}
		return i;
	}


	public List<Article> getArticles(){
		List<Article> articles = new ArrayList<>();

		for (LigneDeCommande ligneDeCommande : ligneDeCommandes) {
			articles.add(ligneDeCommande.getArticle());
		}
        return articles;
    }



	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String infosCommande = date.format(formatter)+" \n";
		//TODO ajouter la liste des articles à la chaîne (avec un passeage à la ligne entre chaque article) de caractères infosCommande.
		infosCommande += "Articles : \n";
		for(LigneDeCommande article : ligneDeCommandes){
			infosCommande += article.toString()+"\n";
		}
		//TODO ajouter le prix total à la chaîne de caractères infosCommande après la liste des articles.
		infosCommande += "Prix total : \n";
		double prixTotal = 0;
		for (LigneDeCommande article : ligneDeCommandes) {
			prixTotal += article.calculerPrixTVAComprise();
		}

		infosCommande += prixTotal;

		
		return infosCommande;
	}
}
