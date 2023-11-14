import java.util.Random;
import java.util.Scanner;

public class NombreMystère {
    static String[] message = new String[]{"Tu es mauvais Jack", "Bravo, mais tu n'as pas encore réussi","Hmm c'est pas encore ça","Mince","Pourquoi tu es si lent ?","Haha", "C'est génial","Oui mais non", "D'accord","Trouve là","Tu fais exprès ?","SPJDIQSJP","Ok...","Trouve sinon j'arrête le jeu","il te reste 3 essais", "2 essais..","1 dernier...","Bon...","Aurevoir :) "};

    public static void main(String[] args) {
        Random random = new Random();
        int nombreMystère = random.nextInt(100);


        Scanner scanner = new Scanner(System.in);
        int response;
        int i = 0;
        do {
            System.out.print("Entrer un nombre ");
           response = scanner.nextInt();
            if(response > nombreMystère){
                System.out.println(getMessage(i)+", le nombre est plus petit");
            }
            if(response < nombreMystère){
                System.out.println(getMessage(i)+", le nombre est plus grand");
            }
            i++;
        }while (response != nombreMystère);

        System.out.println("Super tu as trouvé !");
    }

    public static String getMessage(int i){
        if(i > message.length){
            System.exit(0);
        }
        return message[i];
    }
}
