import java.util.Scanner;

public class Calendrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de jours ? ");
        int jour = Math.abs(scanner.nextInt());
        Integer premierJour = null;
        System.out.print("Quel premier jour du mois ? ");
        while (premierJour == null){
            premierJour = scanner.nextInt();
            if(premierJour > 7 || premierJour <= 0){
                premierJour = null;
                System.out.print("Vous vous êtes trompés, veillez mettre un jour entre 1 et 7 : ");
            }
        }


        scanner.close();

        System.out.print("Lu\tMa\tMe\tJe\tVe\tSa\tDi\n");

        int somme = 0;
        int i = 0;
        while (true){
            i++;
            for (int j = 1; j <= 7; j++) {
                if(i == 1 && premierJour > j){
                    System.out.print("\t");
                    continue;
                }
                somme++;
                System.out.print(somme);
                System.out.print("\t");

                if(somme >= jour){
                    return;
                }
            }
            System.out.println();
        }
    }
}
