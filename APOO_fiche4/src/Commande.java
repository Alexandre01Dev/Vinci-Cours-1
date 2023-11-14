import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
public class Commande {
	private ArrayList<Article> articles; // ou private List<Article> articles = new ArrayList<>(); directement
	private LocalDate date;
	
	public Commande(){
		date = LocalDate.now();
		articles = new ArrayList<>(); // ou le faire directement dans les attributs
	}

	public double calculerPrixTotal(){
		double prixTotal = 0;
		for (Article article : articles) {
			prixTotal += article.calculerPrixTVAComprise();
		}
		return prixTotal;
	}

	public void ajouterArticle(Article article){
		articles.add(article);
	}



	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String infosCommande = date.format(formatter)+" \n";
		infosCommande += "Articles : \n";
		for(Article article : articles){
			infosCommande += article.toString()+"\n";
		}
		//TODO ajouter la liste des articles à la chaîne (avec un passeage à la ligne entre chaque article) de caractères infosCommande.
		infosCommande += "Prix total : \n";
		double prixTotal = 0;
		for (Article article : articles) {
			prixTotal += article.calculerPrixTVAComprise();
		}
		infosCommande += prixTotal;
		//TODO ajouter le prix total à la chaîne de caractères infosCommande après la liste des articles.
		
		return infosCommande;
	}
}
