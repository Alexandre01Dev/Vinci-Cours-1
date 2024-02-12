import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Utilitaire extends Vehicule{
    public static final int KMPARDEFAUT = 50000;

    public final double kilometrageMaxEntreControle;
    public double kilometrageParControle;

    public Utilitaire(String numeroChassis, String immatriculation, LocalDate dateMiseEnCirculation, LocalDate dernierControle, double kilometrageMaxEntreControle) {
        super(numeroChassis, immatriculation, dateMiseEnCirculation, dernierControle);
        this.kilometrageMaxEntreControle  = kilometrageMaxEntreControle;
    }

    public Utilitaire(String numeroChassis, String immatriculation, LocalDate dateMiseEnCirculation, LocalDate dernierControle) {
        this(numeroChassis, immatriculation, dateMiseEnCirculation, dernierControle,KMPARDEFAUT);
    }

    @Override
    public boolean estEnOrdreTechnique() {
        if(kilometrageParControle <= kilometrageParControle){
            kilometrageParControle = 0;
            return true;
        }
        return false;
    }

    @Override
    public void setKilometrage(double kilometrage) {
        double ancientKM = getKilometrage();
        super.setKilometrage(kilometrage);
        kilometrageParControle += (kilometrage - ancientKM);
    }

    public double getKilometrageMaxEntreControle() {
        return kilometrageMaxEntreControle;
    }

    public double getKilometrageParControle() {
        return kilometrageParControle;
    }

    public void setKilometrageParControle(double kilometrageParControle) {
        this.kilometrageParControle = kilometrageParControle;
    }
}
