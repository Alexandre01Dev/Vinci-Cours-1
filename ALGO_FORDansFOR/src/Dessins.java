import java.util.Random;

public class Dessins {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int choix;
		do{
			afficherMenu();
			System.out.print("\nEntrez votre choix : ");
			choix=scanner.nextInt();
			switch(choix){
				case 1: carre();
					break;
				case 2: triangleVersion1();
					break;
				case 3: triangleVersion2();
					break;
				case 4: pyramide();
					break;
				case 5: losange();
					break;

				// A COMPLETER
			}
			System.out.println();
		}
		while (true);
		//while(choix>=1 && choix<=5);
	}

	private static void afficherMenu(){
		System.out.println("*********");
		System.out.println("Dessins :");
		System.out.println("*********");
		System.out.println("1 -> carre");
		System.out.println("2 -> triangle version 1");
		System.out.println("3 -> triangle version 2");
		System.out.println("4 -> pyramide");
		System.out.println("5 -> losange");
		// A COMPLETER
	}

	private static void carre() {
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(chooseRandomChar()+" ");
			}
			System.out.print("\n");
		}

	}

	private static void triangleVersion1() {
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(chooseRandomChar()+" ");
			}
			System.out.print("\n");
		}
	}

	public static void triangleVersion2(){
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(chooseRandomChar()+" ");
			}
			System.out.print("\n");
		}
	}

	private static void pyramide() {
		System.out.println("Pyramide");
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();
		//int o = (2*n+1)/2;
		for (int i = 0; i < n; i++) {
			/*for (int j = 0; j < o; j++) {
				System.out.print(" ");
			}*/
			for (int j = (((2*n+1))/2)-i; j > 0; j--) {
				System.out.print(" ");
			}
			//o--;
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print(chooseRandomChar());
			}
			System.out.print("\n");
		}
	}

	private static void losange(){
		System.out.println("Losange");
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();
		int nbrCroixTriangle1 = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < nbrCroixTriangle1; j++) {
				System.out.print("X");
			}
			int nbBlanc = (n-nbrCroixTriangle1);
			for (int j = 0; j < nbBlanc; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < nbrCroixTriangle1; j++) {
				System.out.print("X");
			}
			System.out.print("\n");
			nbrCroixTriangle1--;

		}

	}



	public static char chooseRandomChar(){
		// choose upperchase or #
		if(new Random().nextInt(2)==0){
			return (char) (new Random().nextInt(26) + 'A');
		}else {
			return '#';
		}

	}
}
