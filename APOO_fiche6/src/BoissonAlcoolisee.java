public class BoissonAlcoolisee extends Boisson{
    private final double degreAlcool;


    public BoissonAlcoolisee(String nom, double contenance, double prix, double degreAlcool) {
        super(nom, contenance, prix);
        this.degreAlcool = degreAlcool;
    }

    public double getDegreAlcool() {
        return degreAlcool;
    }

    @Override
    public String toString() {
        return super.toString() + " (degré d'alcool : " + degreAlcool + "°)";
    }
}
