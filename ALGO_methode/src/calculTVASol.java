import java.util.Scanner;

public class calculTVASol {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String [] args){
		double prixHorsTVA, prixAvecTVA, tva;
		prixHorsTVA = scanner.nextDouble();
		tva = scanner.nextDouble();
		
		
		prixAvecTVA = calculerPrixAvecTVA(prixHorsTVA,tva);
		
		
		System.out.println("Le prix avec TVA ("+tva+"%) : " + prixAvecTVA);
	}	

	
	public static double calculerPrixAvecTVA(double prix, double tva){
		return prix + (prix*tva/100);
	}
	
}
