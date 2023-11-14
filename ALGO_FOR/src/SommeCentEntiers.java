import java.util.Scanner;

public class SommeCentEntiers {
    public static void main(String[] args) {
        int somme = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 100; i++) {
            System.out.println("Entrez votre nombre n°"+i);
            int result = scanner.nextInt();
            somme += result;
        }
        System.out.println(somme);
    }
}
