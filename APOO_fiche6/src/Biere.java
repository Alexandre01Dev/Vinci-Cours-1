public class Biere extends BoissonAlcoolisee {
    private boolean sousPression;

    public Biere(String nom, double contenance, double prix, double degreAlcool, boolean sousPression) {
        super(nom, contenance, prix, degreAlcool);
        this.sousPression = sousPression;
    }

    public boolean isSousPression() {
        return sousPression;
    }

    @Override
    public String toString() {
        if(sousPression){
            return "(Bierre pression) " + super.toString();
        }
        return "(Bierre en bouteille) " + super.toString();
    }
}
