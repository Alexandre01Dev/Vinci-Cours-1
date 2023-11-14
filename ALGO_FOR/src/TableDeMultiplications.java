import java.util.Scanner;

public class TableDeMultiplications {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisis ton nombre");
        int number = scanner.nextInt();
        calculateTable(number);
    }

    public static void calculateTable(int number){
        for (int i = 0; i <= 10; i++) {
            System.out.println(number+"*"+i+" = "+(number * i));
        }
    }
}
