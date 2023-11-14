package fiche2;

public class TestCentre {
    public static void main(String[] args) {
        Point point1 = new Point(4,2.5);
        CercleDansLePlan cercle1 = new CercleDansLePlan(4,point1);

        CercleDansLePlan cercle2 = new CercleDansLePlan(12.5,point1);
        cercle2.getCentre().setX(8);
        System.out.println(cercle1);
        System.out.println(cercle2);
    }
}
