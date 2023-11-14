public class TestClub {
    public static void main(String[] args) {
        Club club = new Club("92890838098","AAAAH",new Adresse("Rue du champs","123","GrrLand","1111"));
        Joueur joueur1 = new Joueur("123","DUPONT","Jean",new Date(1,1,1990),club,1000,0);
        Joueur joueur2 = new Joueur("124","LEGRAND","Michel",new Date(1,1,1990),club,1000,0);


        System.out.println("Joueur 1 : "+joueur1);
        System.out.println("Joueur 2 : "+joueur2);

        Tournoi tournoi = new Tournoi("Tournoi 1",new Date(1,1,2019),new Date(1,1,2019),club);

        System.out.println("Tournoi : "+tournoi);

        Partie partie = new Partie(new Date(1,2,2019),joueur1,joueur2,tournoi);
        System.out.println(partie);


        partie.enregistrerPartie(1);

        joueur1.incrementerParties();
        joueur2.incrementerParties();

        System.out.println("Gagnant : "+partie.recupererGagnant());


        Tournoi tournoi2 = new Tournoi("Tournoi 2",new Date(1,1,2019),new Date(1,1,2019));
        System.out.println("Tournoi 2 : "+tournoi2);
        Partie partie2 = new Partie(new Date(1,2,2019),joueur1,joueur2,tournoi2);
        System.out.println(partie2);

        joueur1.incrementerParties();
        joueur2.incrementerParties();

        partie2.enregistrerPartie(0.5d);

        System.out.println("Gagnant : "+partie2.recupererGagnant());


    }
}
