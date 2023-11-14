import java.util.Scanner;

public class SommesNegatifsEtPositifs {
    public static void main(String[] args) {
        int positive = 0,negative = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Choisi ton nombre ");
            int result = scanner.nextInt();
            if(result >= 0){
                positive += result;
            }
            if(result <= 0){
                negative += result;
            }
        }
        System.out.println("Positives -> "+ positive);
        System.out.println("Negatives -> "+ negative);
    }
}
