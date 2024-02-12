import java.util.ArrayList;
import java.util.List;

public class TableauTrieDEntiers{

	private int [] t;  // table d'entiers triee par ordre croissant
	private int nombreEntiers;    // nombre d'entiers dans t
	private static final int TAILLE = 10;


	public TableauTrieDEntiers(){
		t = new int[TAILLE];
		nombreEntiers = 0;
	}

	public int getNombreEntiers(){
		return nombreEntiers;
	}

	/** 
	 * methode qui ajoute un entier si la table n'est pas encore pleine.
	 * La table doit rester triee!
	 * @param entier l'entier a ajouter
	 * @return boolean signale si l'entier a pu etre ajoute
	 */
	public boolean ajouterUnEntier(int entier){
		if(nombreEntiers >= t.length)
			return false;
		for (int i = nombreEntiers-1; i >= 0 ; i--) {
			System.out.println(i);
			int last = t[i];
			if(last > entier){
				t[i+1] = last;
			}else {
				System.out.println("trouvé " + last +">"+ entier);
				t[i+1] = entier;
				nombreEntiers++;
				return true;
			}
		}
		t[0] = entier;
		nombreEntiers++;
		return true;
	}

	
	/**
	 * methode qui recherche l'indice correspondant a la premiere occurrence de l'entier passe en parametre
	 * @param entier l'entier recherche
	 * @return indice correspondant a l'entier, -1 s'il n'est pas dans la table
	 */
	private int trouverIndiceLineaire(int entier){
		
		//recherche sequentielle cout O(N)

		for (int i = 0; i < this.nombreEntiers; i++) {
			if (t[i]==entier)
				return i;
			if (t[i]>entier)
				return -1;
		}
		return -1;
		
	}

	
	/** 
	 * methode qui verifie si la table contient l'entier passe en parametre
	 * @param entier l'entier recherche
	 * @return boolean true si l'entier est present dans la table, false sinon
	 */
	public boolean contient(int entier){


		
		// TODO
		// UTILISER LA METHODE trouverIndiceLineaire() donnee

		return trouverIndiceLineaire(entier) != -1;

	}  

	
	/** 
	 * methode qui supprime une occurrence de l'entier passe en parametre.
	 * La table doit rester triee!
	 * @param entier l'entier a supprimer
	 * @return boolean signale si l'entier a pu etre supprime
	 */
	public boolean supprimerUneOccurrence(int entier){
		
		// TODO
		// UTILISEZ LA METHODE trouverIndiceLineaire()

		return false;

	} 

	
	/** 
	 * methode qui supprime toutes les occurrences d'un entier
	 * @param entier l'entier a supprimer
	 * @return int le nombre de suppressions effectuees
	 */
	public int supprimerToutesLesOccurrences(int entier){
		
		// TODO

		//Dans une table triee, toutes les occurrences de l'entier se suivent
		//Il est possible d'ecrire cette methode en un seul passage dans la boucle
		//Pour une question d'efficacite, evitez d'utiliser la methode supprimerUneOccurrence()


		return 0;
	}

	
	/** 
	 * methode qui verifie si la table contient des ex-aequos
	 * @return boolean true si la table contient des ex-aequos, false sinon
	 */
	public boolean contientExAequo(){
		
		// TODO

		// Il est possible d'ecrire cette methode en un seul passage dans la boucle
		// N'oubliez pas que la table est triee!

		return false;

	}

	
	/** 
	 * methode qui supprime tous les ex-aequos
	 * @return int le nombre de suppressions effectuees
	 */
	public int supprimerTousLesExAequos(){
		
		// TODO

		//Il est possible d'ecrire cette methode en un seul passage dans la boucle
		//Pour une question d'efficacite, evitez d'utiliser pas la methode supprimerUneOccurrence()
		
		return 0;

	}

	//A ne pas modifier
	//Va servir pour les tests
	public String toString(){
		if(nombreEntiers ==0)
			return "[]";
		String aRenvoyer = "["+ t[0];
		for (int i = 1; i < nombreEntiers; i++)
			aRenvoyer = aRenvoyer + ", " + t[i];
		return aRenvoyer+"]";
	}

	/**
	 * constructeur par recopie
	 * ce constructeur leve une exception si la table passee en parametre contient plus de 10 entiers
	 * utile pour les tests et/ou si elle n'est pas triee
	 * @param tableARecopier une table triee d'au plus TAILLE entiers triee par ordre croissant
	 */

	public TableauTrieDEntiers(int[] tableARecopier){
		if (tableARecopier.length>TAILLE)
			throw new IllegalArgumentException();
		this.nombreEntiers = tableARecopier.length;
		t = new int[TAILLE];
		if(tableARecopier.length!=0)
			t[0] = tableARecopier[0];
		for (int i = 1; i< nombreEntiers; i++){
			if(tableARecopier[i]<tableARecopier[i-1]){
				throw new IllegalArgumentException();
			}
			t[i] = tableARecopier[i];
		}
	}


}