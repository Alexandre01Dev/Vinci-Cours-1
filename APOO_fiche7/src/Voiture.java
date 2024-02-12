import java.time.LocalDate;

public class Voiture extends Vehicule{
    public final static int DERNIERCONTROLEENANNEE = 1;
    public final static int MISEENCIRCULATIONENANNEE = 4;
    public Voiture(String numeroChassis, String immatriculation, LocalDate dateMiseEnCirculation, LocalDate dernierControle) {
        super(numeroChassis, immatriculation, dateMiseEnCirculation, dernierControle);
    }

    @Override
    public boolean estEnOrdreTechnique() {
        return getDateMiseEnCirculation().isAfter(LocalDate.now().minusYears(MISEENCIRCULATIONENANNEE)) ||
                getDernierControle().isAfter(LocalDate.now().minusYears(DERNIERCONTROLEENANNEE));
    }
}
