package fiche2;

public class TestHeure {
    public static void main(String[] args) {
        System.out.println(TestHeure.estPlusTard(15,15,15,25));
        System.out.println(TestHeure.estValide(23,1));
    }
    public static boolean estPlusTard(int heure1, int minute1, int heure2, int minute2) {
        return (heure1 > heure2) || (heure1 == heure2 && minute1 > minute2);
    }
    public static boolean estValide(int heure, int minute) {
        return (heure >= 0 && heure < 24) && (minute < 60 && minute >= 0);
    }
}