import java.util.Scanner;

public class SommesNegatifsParmi10 {
    public static void main(String[] args) {
        int negative =0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Choisi ton nombre ");
            int result = scanner.nextInt();
            if(result <= 0){
                negative++;
            }
        }
        System.out.println("Il y a "+negative+" nombre négatif");
    }
}
