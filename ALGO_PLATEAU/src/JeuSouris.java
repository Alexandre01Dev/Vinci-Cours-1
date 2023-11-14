public class JeuSouris {

	public static void main(String[] args){

		int positionSouris = 1;
		PlateauJeuSouris jeu = new PlateauJeuSouris();
		jeu.afficherInformation("Vas-y !");
		jeu.placerSouris(positionSouris);
		jeu.placerFromage(10);
		// A COMPLETER
		boolean fromageMange = false;
		int lanceDe;
		while (positionSouris != 16){
			lanceDe =  jeu.lancerDe();

			int cible = positionSouris + lanceDe;
			jeu.supprimerSouris();
			if(cible > 10 && !fromageMange){
				jeu.placerSouris(10);
				positionSouris = 10;
				jeu.supprimerFromage();
				jeu.afficherInformation("Souris a mangé le fromage");
				fromageMange = true;
				continue;
			}

			if(cible >= 16){
				jeu.placerSouris(16);
				jeu.afficherInformation("Souris est rentrée dans sa tanière");
				positionSouris = 16;
				continue;
			}
			jeu.placerSouris(cible);
			positionSouris = cible;
		}
	}
}
