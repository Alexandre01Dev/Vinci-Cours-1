package fiche2;

public class TestCercle5 {
    public static void main(String[] args) {
        Point point1 = new Point(4.0, 7.0);
        Point point2 = new Point(-3.0, 5.0);
        double rayon = 4.0;
        CercleDansLePlan c1 = new CercleDansLePlan(rayon, point1);
        rayon = 7.0;
        System.out.println(c1.getRayon());
        CercleDansLePlan c2 = new CercleDansLePlan(rayon, point2);
        deplacer(c1, point2);
        deplacer(c2, point1);
        System.out.println("Coordonnées de point1 : " + point1);
        System.out.println("Coordonnées de point2 : " + point2);
        System.out.println("Centre de c1 : " + c1.getCentre());
        System.out.println("Centre de c2 : " + c2.getCentre());
    }

    public static void deplacer(CercleDansLePlan cercle, Point nCentre) {
        Point copie = new Point(nCentre.getX(), nCentre.getY());
        cercle.setCentre(copie);
    }
}