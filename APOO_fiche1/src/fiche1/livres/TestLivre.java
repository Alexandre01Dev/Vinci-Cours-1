package fiche1.livres;

public class TestLivre {

    public static void main(String[] args) {
        Livre dragonBall = new Livre("978-2-7234-9999-9", "Dragon Ball", "Akira Toriyama", 192, 1984,10);
        Livre lePetitPrince = new Livre("978-2-253-00000-1", "Le Petit Prince", "Antoine de Saint-Exupéry", 96, 1943,8);
        System.out.println(dragonBall.titre);
        System.out.println(dragonBall.anneeDEdition);
        System.out.println(dragonBall.nomAuteur);
        System.out.println(lePetitPrince.toString());
    }
}
