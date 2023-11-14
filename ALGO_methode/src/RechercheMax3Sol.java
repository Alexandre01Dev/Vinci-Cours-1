
public class RechercheMax3Sol {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	
	public static void main(String[] args) {
		System.out.println("Entrez l'entier 1 : ");	
		int entier1 = scanner.nextInt();	
		System.out.println("Entrez l'entier 2 : ");	
		int entier2 = scanner.nextInt();
		System.out.println("Entrez l'entier 3 : ");	
		int entier3 = scanner.nextInt();
		int max = max3(entier1,entier2,entier3);
		System.out.println("Le plus grand est : " + max);
	}

	/**
	 * recherche le max parmi les 3 entiers passes en parametre
	 * @param nombre1
	 * @param nombre2
 	 * @param nombre3
	 * @return le max
	*/
	public static int max3(int nombre1, int nombre2, int nombre3){
		if(nombre1 > nombre2 && nombre1 > nombre3){
			return nombre1;
		}
		if(nombre2 > nombre3)
			return nombre2;
		return nombre2;
	}	
}
