public class TestCommande {
	public static void main(String[] args) {
		Article article1 = new Article(
					"Lad700",
					"lapierre tecnic 700 lady",
					"Géométrie adaptée, composants et design spécifiques ont guidé la conception de notre gamme de VTT femme",
					899);
		Article article2 = new Article("TandFit",
					"lapierre tandem route 2 race fit",
					"le vélo tandem, ludique, convivial et performant", 1785,
					23);
		//TODO à compléter

		Commande commande1 = new Commande();
		commande1.ajouterArticle(article1);
		commande1.ajouterArticle(article2);
		commande1.ajouterArticle(article1);

		System.out.println(commande1);
		System.out.println("Recalculer prix -> "+ commande1.calculerPrixTotal());

		Commande commande2 = new Commande();
		commande2.ajouterArticle(article1);

		System.out.println(commande2);
		System.out.println("Recalculer prix -> "+ commande2.calculerPrixTotal());
	}

}
