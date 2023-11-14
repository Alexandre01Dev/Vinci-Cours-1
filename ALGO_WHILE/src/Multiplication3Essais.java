import java.util.Scanner;

public class Multiplication3Essais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbEssais = 3;
        int multiplication1 = nombreAleatoire(0,10);
        int multiplication2 = nombreAleatoire(0,10);
        int reponse;
        do {
            System.out.print("Calcule moi ("+multiplication1+"*"+multiplication2+") = ");
            reponse = scanner.nextInt();
            nbEssais --;
        } while (((multiplication1 * multiplication2) != reponse) && nbEssais != 0);

        if(multiplication1 * multiplication2 == reponse){
            System.out.println("Bravo tu as trouvé la réponse");
        }else {
            System.out.println("Malheureusement tu as échoué");
        }
    }

    public static int nombreAleatoire(int min, int max){
        return (int)((Math.random() * (max-min)) + min);
    }
}
