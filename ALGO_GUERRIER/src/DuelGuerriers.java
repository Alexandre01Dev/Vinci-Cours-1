import java.util.Scanner;

public class DuelGuerriers {

	public static void main(String[] args) {
		int pointsDeVieCogneDur = lancerDe();
		System.out.println("CogneDur a "+pointsDeVieCogneDur+" points de vie");
		int pointsDeVieFrappeFort = lancerDe();
		System.out.println("FrappeFort a "+pointsDeVieFrappeFort+" points de vie");

		// A COMPLETER
		System.out.print("Appuyez sur entree pour lancer le combat");
		new Scanner(System.in).nextLine();
		System.out.println("GogneDur attaque");
		pointsDeVieFrappeFort -= lancerDe();
		System.out.println("FrappeFort à "+ pointsDeVieFrappeFort);
		if(pointsDeVieFrappeFort > 0){
			System.out.print("Appuyez sur entree pour lancer le combat");
			new Scanner(System.in).nextLine();
			System.out.println("FrappeFort attaque");
			pointsDeVieCogneDur -= lancerDe();
			System.out.println("FrappeFort a "+ pointsDeVieCogneDur);
			if(pointsDeVieCogneDur > 0){
				System.out.println("FrappeFort et CogneDur sont toujours vivants");
				if(pointsDeVieFrappeFort > pointsDeVieCogneDur){
					System.out.println("FrappeFort a gagné car il est plus résistant");
				}else {
					if(pointsDeVieFrappeFort == pointsDeVieCogneDur){
						System.out.println("FrappeFort et CogneDur sont à égalité");
					}else {
						System.out.println("CogneDur a gagné car il est plus résistant");
					}
				}
			}else {
				System.out.println("FrappeFort a gagné en repliquant son attaque de manière brutale");
			}
		}else {
			System.out.println("CogneDur a gagné en faisant un OneShot");
		}
		// while part
		/*while (pointsDeVieCogneDur > 0 && pointsDeVieFrappeFort > 0) {

		}*/
	}



	public static int lancerDe(){
		return (int)((Math.random() * 6) + 1);
	}
}
