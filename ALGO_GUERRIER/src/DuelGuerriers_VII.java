public class DuelGuerriers_VII {

    public static void main(String[] args) {

        FenetreCombatGuerriers jeu = new FenetreCombatGuerriers();
        jeu.afficherInformation("A CogneDur");
        int pointsDeVieCogneDur = jeu.lancerDe();
        jeu.afficherPointsDeVie(1, pointsDeVieCogneDur);
        jeu.afficherInformation("A FrappeFort");
        int pointsDeVieFrappeFort = jeu.lancerDe();
        jeu.afficherPointsDeVie(2, pointsDeVieFrappeFort);
        jeu.afficherInformation("A CogneDur");
        while (pointsDeVieCogneDur > 0 && pointsDeVieFrappeFort > 0){
                jeu.afficherInformation("CogneDur attaque");
                pointsDeVieCogneDur -= jeu.lancerDe();
                jeu.afficherEpee(1);
                jeu.afficherBouclier(2);
                jeu.afficherPointsDeVie(2,pointsDeVieCogneDur);
                // System.out.println("CogneDur a "+ pointsDeVieCogneDur);
                jeu.degats(2);
                jeu.afficherInformation("CogneDur à "+ pointsDeVieFrappeFort);
                if(pointsDeVieCogneDur > 0){
                    jeu.afficherInformation("FrappeFort attaque");
                    pointsDeVieFrappeFort -= jeu.lancerDe();
                    jeu.afficherEpee(2);
                    jeu.afficherBouclier(1);
                    jeu.afficherPointsDeVie(1,pointsDeVieFrappeFort);
                    jeu.degats(1);
                }
        }
        if(pointsDeVieCogneDur > 0){
            jeu.afficherInformation("CogneDur a gagné");
            jeu.afficherCroix(1);
            jeu.afficherCoupeOr(2);
        }else {
            jeu.afficherInformation("FrappeFort a gagné");
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
