public class Statistiques {

    public static void main(String[] args) {
        System.out.println("Statistique 1");
        afficherStat(new double[]{15,12,11.5,10});
        System.out.println("Statistique 2");
        afficherStat(new double[]{10,11,12,13});
        System.out.println("Statistique 3");
        afficherStat(new double[]{15,14,13,12});
    }


    public static void afficherStat(double[] cotes){
        double maxCote = 0;
        double minCote = Double.MAX_VALUE; // ou 20
        double somme = 0;
        for (int i = 0; i < cotes.length; i++) {
            if(maxCote < cotes[i]){
                maxCote = cotes[i];
            }
            if(minCote > cotes[i]){
                minCote = cotes[i];
            }
            somme += cotes[i];
        }

        System.out.println("La cote la plus haute est de "+ maxCote);
        System.out.println("La cote la plus basse est de "+ minCote);
        if(cotes.length != 0)
            System.out.println("La moyenne est "+ somme/cotes.length);
    }

}
