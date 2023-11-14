package fiche2;

public class CercleDansLePlan {
    private double rayon;
    private Point centre;

    public CercleDansLePlan(double rayon, Point point) {
        this.rayon = rayon;
        this.centre = point;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point point) {
        this.centre = point;
    }

    @Override
    public String toString() {
        return "Cercle de rayon "+ rayon+ " avec un "+ centre;
    }
}
