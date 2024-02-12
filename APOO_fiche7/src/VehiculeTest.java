import java.time.LocalDate;

public class VehiculeTest {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("qf","fezf", LocalDate.of(2023,11,27),LocalDate.of(2023,11,28));
        Voiture voiture2 = new Voiture("qf","fezf", LocalDate.of(2018,11,27),LocalDate.of(2022,11,28));
        System.out.println(voiture1.estEnOrdreTechnique());
        System.out.println(voiture2.estEnOrdreTechnique());
    }
}
