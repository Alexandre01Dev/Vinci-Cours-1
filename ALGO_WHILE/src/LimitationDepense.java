import java.util.Scanner;

public class LimitationDepense {
    public static void main(String[] args) {
        solution2();
    }


    public static void solution1(){
        Scanner scanner = new Scanner(System.in);
        int max;
        int depense = 0;
        System.out.print("Quelle est votre dépense maximal > ");
        max = scanner.nextInt();
        while (true){
            System.out.print("Entrer votre nouvelle dépense > ");
            int nDepense = scanner.nextInt();
            if(depense+nDepense > max) break;
            depense += nDepense;
        }

        System.out.println("Fond insuffisant il vous reste "+ depense);
    }

    public static void solution2(){
        Scanner scanner = new Scanner(System.in);
        int max;
        int depense = 0;
        System.out.print("Quelle est votre dépense maximal > ");

        max = scanner.nextInt();
        int nDepense = 0;
        do{
            depense += nDepense;
            System.out.print("Entrer votre nouvelle dépense > ");
            nDepense = scanner.nextInt();
        }while (depense+nDepense <= max);

        System.out.println("Fond insuffisant il vous reste "+ depense);
    }
}
