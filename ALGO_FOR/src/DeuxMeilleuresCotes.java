import java.util.Scanner;

public class DeuxMeilleuresCotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max1 = 0;
        double max2 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Entrez un nombre: ");
            double cote = scanner.nextDouble();
            if(cote >= max1) {
                max2 = max1;
                max1 = cote;
            }
        }

        System.out.println("Meilleure note 1 : "+ max1);
        System.out.println("Meilleure note 2 : "+ max2);
    }
}
