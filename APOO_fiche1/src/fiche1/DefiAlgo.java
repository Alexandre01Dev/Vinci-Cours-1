package fiche1;

import java.util.Scanner;

public class DefiAlgo {
    char operation;
    public static void main(String[] args) {
        new DefiAlgo().execute();
    }

    public DefiAlgo(){

    }

    public void execute(){
        // generate random number between min and max
        int random1 = generateRandomNumber(1,100);
        int random2 = generateRandomNumber(1,100);

        int operator = generateRandomNumber(0,3);

        int calcul = 0;
        switch (operator){
            case 0:
                calcul = random1+random2;
                operation = '+';
                break;
            case 1:
                calcul = random1-random2;
                operation = '-';
                break;
            case 2:
                calcul = random1*random2;
                operation = '*';
                break;
            case 3:
                calcul = random1/random2;
                operation = '/';
                break;
        }

        if(calcul > 100){
            execute();
            return;
        }


        scanner(random1,random2,calcul);

        System.out.println("Le calcul est "+ calcul);

    }

    public void scanner(int r1, int r2,int calcul) {
        System.out.println("L'operation est "+ r1 +operation+r2);
        Scanner scanner = new Scanner(System.in);
        String line;
        while ((line = scanner.nextLine()) != null) {
            if(line.matches("[0-9]+")){
                int i = Integer.parseInt(line);
                if(i == calcul){
                    System.out.println("Bravo");
                    break;
                }
                System.out.println("Ce n'est pas juste, recommence");
            }else {
                System.out.println("N'est pas un nombre, recommence");
            }

        }
        scanner.close();
    }
    //generate random number between min and max
    public int generateRandomNumber(int min, int max){
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
