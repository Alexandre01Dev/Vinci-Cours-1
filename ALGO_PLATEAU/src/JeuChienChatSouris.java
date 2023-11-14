import java.util.Random;

public class JeuChienChatSouris {

    public static void main(String[] args){

        PlateauJeuChienChatSouris jeu = new PlateauJeuChienChatSouris();

        int positionChien = nombreAleatoire(2,15);
        int positionChat = 1;
        int positionSouris = 3;
        int positionFromage;
        do {
            positionFromage = nombreAleatoire(4,15);
        }while (positionFromage == positionChien);

        jeu.placerChien(positionChien);
        jeu.placerChat(positionChat);
        jeu.placerSouris(positionSouris);
        jeu.placerFromage(positionFromage);

        int alternance = 0;
        boolean sourisAttrape = false;
        boolean chatAttrape = false;
        while (positionSouris != 16 && !sourisAttrape && !chatAttrape){
            int lanceDe = jeu.lancerDe();

            if(alternance % 2 == 0){
                //souris
                jeu.supprimerSouris();
                int positionFinale = positionSouris+ lanceDe;
                if(positionFinale >= positionFromage){
                    positionSouris = positionFromage;
                    jeu.supprimerFromage();
                    jeu.afficherInformation("La souris mange le fromage");
                }else {
                    if(positionFinale == positionChien){
                        positionSouris = positionChien+1;
                        jeu.afficherInformation("La souris avance en sautant par dessus le chien");
                    }else {
                        positionSouris = positionFinale;
                        jeu.afficherInformation("La souris avance");
                    }

                }
                if(positionFinale >= 16){
                    positionSouris = 16;
                    jeu.afficherInformation("La souris est arrivé à destination");
                }
                jeu.placerSouris(positionSouris);
            }else{
                jeu.supprimerChat();
                int positionFinale = positionChat + lanceDe;

                if(positionFinale >= positionSouris){
                    sourisAttrape = true;
                    jeu.supprimerSouris();
                    jeu.afficherInformation("La souris a été attrapé");
                    positionChat = positionSouris;
                    jeu.placerChat(positionChat);
                }else {
                    if(positionFinale == positionChien){
                        positionChat = positionChien;
                        chatAttrape = true;
                        jeu.afficherInformation("La chat a été attrapé");
                        jeu.supprimerChat();
                    }else {
                        positionChat = positionFinale;
                        jeu.placerChat(positionChat);
                        jeu.afficherInformation("La chat avance");
                    }
                }

            }
            alternance++;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        main(args);
    }

    public static int nombreAleatoire(int min,int max){
        return new Random().nextInt(max - min) + min;
    }
}
