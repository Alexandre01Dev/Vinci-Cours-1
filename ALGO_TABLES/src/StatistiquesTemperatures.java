import java.util.Arrays;

public class StatistiquesTemperatures {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);
	public static Temperatures temperatures;
	
	public static void main(String[] args) {
		
		chargerTemperatures();
		System.out.println(temperatures.toString());
		
		System.out.println("*****************************");
		System.out.println("Temperatures : statistiques :");
		System.out.println("*****************************");
		int choix;
		do{
			System.out.println();
			System.out.println("1 -> afficher toutes les temperatures");	
			System.out.println("2 -> calculer la moyenne");	
			System.out.println("3 -> calculer afficherNombreJourDeGel");
			System.out.println("4 -> calculer afficherJoursDeGel");
			System.out.println("5 -> calculer afficherToutesPositives");
			System.out.println("6 -> calculer afficherJoursMax");
			System.out.println("7 -> calculer afficherJoursMin");
			System.out.print("Entrez votre choix : ");	
			choix=scanner.nextInt();
			switch(choix){	
			case 1: afficherTout();   
			break;
			case 2: afficherMoyenne();   
			break;
			case 3: afficherNombreJourDeGel();
			break;
			case 4: afficherJoursDeGel();
			break;
			case 5: afficherToutesPositives();
			break;
			case 6: afficherTemperatureMax();
			break;
			case 7: afficherTemperatureMin();
			break;
			}
		}while(choix >=1 && choix<=7);
	}
	
	private static void afficherTout() {
		System.out.println(temperatures.toString());
	}

	private static void afficherMoyenne() {
		// TODO
		System.out.println("cette methode et la classe doivent etre completees");
		System.out.println(temperatures.moyenne());
	}

	public static void afficherNombreJourDeGel(){
		System.out.println("Le nombre de jours de gels est de "+ temperatures.nombreJoursDeGel());
	}

	public static void afficherJoursDeGel(){
		System.out.println("Les jours de gels sont les suivants "+ Arrays.toString(temperatures.joursDeGel()));
	}

	public static void afficherToutesPositives(){
		if(temperatures.toutesPositives()){
			System.out.println("Tout les jours ont une température positive");
		}else {
			System.out.println("Il y a des jours avec une température négative");
		}
	}

	public static void afficherTemperatureMin(){
		System.out.println("Les jours avec température minimum "+ Arrays.toString(temperatures.joursMin()));
	}

	public static void afficherTemperatureMax(){
		System.out.println("Les jours avec température minimum "+ Arrays.toString(temperatures.joursMax()));
	}

	public static void chargerTemperatures(){
		double[]tableTemperatures = {-1,1,0,1,-1,-3,-3,-2,0,-1,0,1,1,3,5,4,2,0,1,1,5,3,2,0,-1,0,1,1,3,4,5};
		temperatures = new Temperatures("janvier",tableTemperatures);
	}

	
	public static void afficherTable(int[]table){
		System.out.println(Arrays.toString(table));
	}
	
}
