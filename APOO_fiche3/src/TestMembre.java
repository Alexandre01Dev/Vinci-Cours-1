public class TestMembre {
    public static void main(String[] args) {
        Membre membre = new Membre("nom", "prenom", "telephone");
        System.out.println(membre);

        membre.initialiserParrain(new Membre("Parain", "Jack", "telephone"));
        System.out.println(membre);
    }
}
