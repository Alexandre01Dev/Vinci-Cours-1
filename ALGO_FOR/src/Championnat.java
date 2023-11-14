public class Championnat {

    public static void main(String[] args) {
        calculerCote(new double[]{8,8.1,8.7,9.3,8.3,5,8});
    }

    public static boolean filtrerCote(double cote){
        return cote >= 8;
    }



    public static void calculerCote(double[] cotes){
        double max = 0;
        double min = 10;
        for (int i = 0; i < cotes.length; i++) {
            double cote = cotes[i];
            if(cote > max){
                max = cote;
            }
            if(cote < min){
                min = cote;
            }
        }
        double somme = 0;
        for (int i = 0; i < cotes.length; i++) {
            double cote = cotes[i];
            if(cote == max){
                continue;
            }
            if(cote == min){
                continue;
            }
            somme += cote;
        }

        if(cotes.length -2 <= 0){
            System.out.println("Calcul impossible, pas assez de données");
        }
        double moyenne = somme/(cotes.length-2);
        if(!filtrerCote(moyenne)){
            System.out.println("La cote du joueur est trop basse avec une moyenne de "+moyenne);
            return;
        }

        System.out.println("Le joueur a été séléctionné avec une moyenne de "+ moyenne);
    }
}
