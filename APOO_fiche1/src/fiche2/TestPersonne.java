package fiche2;

public class TestPersonne {


    public static void main(String[] args) {
        Adresse adresse = new Adresse("rue", "0", "ville", "0");
        Personne personne1 = new Personne("Dre", "Julien", new Date(12,1,2002), adresse);
        Personne personne2 = new Personne("LeBon", "Michael", new Date(2,4,2001), adresse);
        personne2.demenager("rue", "0", "ville", "0");

        System.out.println(personne1.toString());
        System.out.println(personne2.toString());
    }

}
