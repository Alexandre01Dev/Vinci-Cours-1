import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JeuDuPendu {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Entrez le mot a trouver : ");

		String motATrouver = scanner.next().toUpperCase();

		for (int i = 0; i < 20; i++) {
			System.out.print("\n");
		}

		FenetrePendu fenetrePendu = new FenetrePendu();

		MotACompleter mot = new MotACompleter(motATrouver);

		//Pour amelioration 1 :

		fenetrePendu.afficherMot(mot.toString());
		LettresLues lettresLues = new LettresLues();
		int morceaux = 0;
		do{
			char lettre = Character.toUpperCase(fenetrePendu.lireLettre());
			System.out.println(lettre);
			lettresLues.ajouterLettreLue(lettre);
			fenetrePendu.afficherLettresLues(lettresLues.toString());
			if(mot.contientLettre(lettre)){

				mot.ajouterLettre(lettre);
				fenetrePendu.afficherMot(mot.motACompleter());

				if(mot.estComplet()){
					fenetrePendu.afficherInformation("Tu as gagné");
					//System.exit(0);
					break;
				}
			}else {
				fenetrePendu.afficherPendu(++morceaux);

				if(morceaux >= 6){
					fenetrePendu.afficherInformation("Malheureusement, tu as perdu");
					break;
				}
			}
		}while (true);





	}

}
