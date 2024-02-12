import java.time.LocalDate;

public abstract class Vehicule {
    private final String numeroChassis;
    private final String immatriculation;
    private LocalDate dernierControle;
    private final LocalDate dateMiseEnCirculation;
    private double kilometrage;
    public Vehicule(String numeroChassis, String immatriculation, LocalDate dateMiseEnCirculation, LocalDate dernierControle){
        if(numeroChassis== null || immatriculation== null || dateMiseEnCirculation == null || dernierControle == null){
            throw new IllegalArgumentException("Une variable ne peut pas être null");
        }

        if(numeroChassis.isEmpty() || immatriculation.isEmpty()){
            throw new IllegalArgumentException("Les chaines de charactères ne peuvent pas être vide");
        }


        this.numeroChassis = numeroChassis;
        this.dateMiseEnCirculation = dateMiseEnCirculation;
        this.dernierControle = dernierControle;
        this.immatriculation = immatriculation;
    }

    public String getNumeroChassis() {
        return numeroChassis;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public LocalDate getDernierControle() {
        return dernierControle;
    }

    public LocalDate getDateMiseEnCirculation() {
        return dateMiseEnCirculation;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setDernierControle(LocalDate dernierControle) {
        if(this.dernierControle.isAfter(dernierControle)){
            throw new IllegalArgumentException("Le dernier controle doit être supérieur à celui déjà inscrit");
        }
        this.dernierControle = dernierControle;
    }

    public void setKilometrage(double kilometrage) {
        if(this.kilometrage > kilometrage){
            throw new IllegalArgumentException("Le kilometrage doit être supérieur à celui déjà inscrit");
        }
        this.kilometrage = kilometrage;
    }

    public abstract boolean estEnOrdreTechnique();
}
