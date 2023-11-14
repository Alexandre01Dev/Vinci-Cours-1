import java.util.Scanner;

public class DuelGuerriers_VI {

    public static void main(String[] args) {

        FenetreCombatGuerriers jeu = new FenetreCombatGuerriers();
        jeu.afficherInformation("A CogneDur");
        int pointsDeVieCogneDur = jeu.lancerDe();
        jeu.afficherPointsDeVie(1, pointsDeVieCogneDur);
        jeu.afficherInformation("A FrappeFort");
        int pointsDeVieFrappeFort = jeu.lancerDe();
        jeu.afficherPointsDeVie(2, pointsDeVieFrappeFort);
        jeu.afficherInformation("A CogneDur");

        pointsDeVieFrappeFort -= jeu.lancerDe();
        jeu.afficherEpee(1);
        jeu.afficherBouclier(2);
        jeu.afficherPointsDeVie(2,pointsDeVieFrappeFort);
        jeu.degats(2);
        jeu.afficherInformation("FrappeFort a "+ pointsDeVieFrappeFort);
        if(pointsDeVieFrappeFort > 0){
            jeu.afficherInformation("FrappeFort attaque");
            pointsDeVieCogneDur -= jeu.lancerDe();
            jeu.afficherEpee(2);
            jeu.afficherBouclier(1);
            jeu.afficherPointsDeVie(1,pointsDeVieCogneDur);
           // System.out.println("CogneDur a "+ pointsDeVieCogneDur);
            jeu.degats(1);
            jeu.afficherInformation("CogneDur à "+ pointsDeVieFrappeFort);
            if(pointsDeVieCogneDur > 0){
                jeu.afficherInformation("FrappeFort et CogneDur sont toujours vivants");
                if(pointsDeVieFrappeFort > pointsDeVieCogneDur){
                    jeu.afficherInformation("FrappeFort a gagné car il est plus résistant");
                    jeu.afficherCoupeOr(2);
                    jeu.afficherCoupeArgent(1);
                }else {
                    if(pointsDeVieFrappeFort == pointsDeVieCogneDur){
                        jeu.afficherInformation("FrappeFort et CogneDur sont à égalité");
                        jeu.afficherCoupeArgent(1);
                        jeu.afficherCoupeArgent(2);
                    }else {
                        jeu.afficherInformation("CogneDur a gagné car il est plus résistant");
                        jeu.afficherCoupeOr(1);
                        jeu.afficherCoupeArgent(2);
                    }
                }
            }else {
                jeu.afficherInformation("FrappeFort a gagné en repliquant son attaque de manière brutale");
                jeu.afficherCoupeOr(2);
                jeu.afficherCroix(1);
            }
        }else {
            jeu.afficherInformation("CogneDur a gagné en faisant un OneShot");
            jeu.afficherCroix(2);
            jeu.afficherCoupeOr(1);
        }

        wait(2500);
        jeu.afficherInformation("Le jeu recommence dans 3");
        wait(1000);
        jeu.afficherInformation("Le jeu recommence dans 2");
        wait(1000);
        jeu.afficherInformation("Le jeu recommence dans 1");
        wait(1000);
        main(args);
        return;
    }



    public static void wait(int ms){
        try {
            Thread.sleep(ms);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
