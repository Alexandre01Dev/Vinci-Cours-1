
public class Date {
    private int mois, jour, annee;

    public Date( int jour, int mois, int annee){
        this.mois = mois;
        this.jour = jour;
        this.annee = annee;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return this.jour + "/" + this.mois + "/" + this.annee;
    }
}
