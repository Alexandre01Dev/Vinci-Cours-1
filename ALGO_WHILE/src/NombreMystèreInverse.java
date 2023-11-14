import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class NombreMystèreInverse {
    static String[] message = new String[]{"Wow tu es vachement mauvais", "Bravo, mais tu n'as pas encore réussi","Hmm c'est pas encore ça","Mince","Pourquoi tu es si lent ?","Haha", "C'est génial","Oui mais non", "D'accord","Trouve là","Tu fais exprès ?","SPJDIQSJP","Ok...","Trouve sinon j'arrête le jeu","il te reste 3 essais", "2 essais..","1 dernier...","Bon...","Aurevoir :) "};
        static  int score = 0;
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mets un nombre mystère");
        int nombreMystère = scanner.nextInt();

        int cramage = 0;

        if(nombreMystère < 0){
            try {
                reflechi();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Sérieusement tu essaie de m'entourlouper là");
            return;
        }
        String response;
        int suspicions = 0;

        int i = 0;

        int[] target = new int[]{0,100};
        System.out.println("Vas-y je veux bien jouer avec toi");
        do {
            score++;
            try {
                reflechi();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int question = nombreAleatoire(target[0],target[1]);

            System.out.println("Est ce que c'est "+ question);
           // System.out.print("Entrer un nombre ");
            if(question == nombreMystère){
                break;
            }
           response = scanner.next();
           char c = response.charAt(0);
           if(c == '+'){
               target[0] = question+1;
           }
           if(c == '-'){
               target[1] = question-1;

           }
           if(target[1] == target[0] || target[1] < target[0] ){
               if(suspicions != 0){
                   target[1] += 10;
                   if(target[1] > 100) target[1] = 100;
                   target[0] -=10;
                   if(target[0] < 0) target[0] = 0;
               }
               suspicions += 50;
               try {
                   reflechi();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }

           if(suspicions >= 100){
               try {
                   reflechi();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

               System.out.println("Tu es SUS !");

               if(cramage == 1){
                   cramé();
               }
               cramage++;
               System.out.println("Dis moi tu as quoi à dire pour ta défense");
               AtomicBoolean b = new AtomicBoolean(false);
               new Thread(new Runnable() {
                   @Override
                   public void run() {
                       try {
                           Thread.sleep(7000);
                           if(!b.get()){
                               System.out.println("J'attends toujours ta réponse..");
                               Thread.sleep(6000);
                               if(!b.get()){
                                   cramé();
                               }
                           }
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
               }).start();

               scanner.next();
               b.set(true);

               System.out.println("ça se tient...");
               suspicions -=50;

               System.out.println("On en était où ? J'ai perdu le fil");

               target[0] = 0;
               target[1] = 100;
           }

           i++;
        }while (true);

        System.out.println("Super j'ai trouvé !");
    }

    public static String getMessage(int i){
        if(i > message.length){
            System.exit(0);
        }
        return message[i];
    }

    public static void reflechi() throws InterruptedException {
        System.out.print("Réfléchis .\r");
        Thread.sleep(500);
        System.out.print("Réfléchis ..\r");
        Thread.sleep(500);
        System.out.print("Réfléchis ...\r");
        Thread.sleep(500);
    }

    public static int nombreAleatoire(int min, int max){
        if(min > max){
            max = min;
            min = max;
        }
        if(min == max) return min;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static void cramé(){
        System.out.println("Tu es cramé ");
        System.out.println("Tu as un score de "+ score+ " de tromperie");
        System.exit(0);
    }
}
