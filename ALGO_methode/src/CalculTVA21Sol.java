import java.util.Scanner;

public class CalculTVA21Sol {


	public static Scanner scanner = new Scanner(System.in);

	public static void main(String [] args){
		double prixHorsTVA, prixAvecTVA;
		prixHorsTVA = scanner.nextDouble();
		prixAvecTVA = calculerPrixAvecTVA(prixHorsTVA);
		System.out.println("Le prix avec TVA (21%) : " + prixAvecTVA);
	}	
	
	// Completez l'entete de la methode :
	
	public static double calculerPrixAvecTVA(double prix){
		return prix + (prix*21/100);
	}
}
