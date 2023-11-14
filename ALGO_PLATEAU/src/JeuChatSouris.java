public class JeuChatSouris {

    public static void main(String[] args){
        int positionSouris = 3;
        int positionChat = 1;
        PlateauJeuChatSouris jeu = new PlateauJeuChatSouris();
        jeu.placerChat(positionChat);
        jeu.placerSouris(positionSouris);
        int choix = 0;
        boolean sourisAttrape = false;


        while ((positionSouris != 16) && !sourisAttrape){
            int lanceDe = jeu.lancerDe();
            int cible;
            if(choix % 2 == 0){
                // la souris court
                cible = lanceDe + positionSouris;
                jeu.supprimerSouris();
                if(cible > 16){
                    cible = 16;
                }
                jeu.placerSouris(cible);
                positionSouris = cible;
            }else {
                // le chat court
                cible = lanceDe + positionChat;

                jeu.supprimerChat();
                if(cible >= positionSouris){
                    jeu.supprimerSouris();
                    jeu.placerChat(positionSouris);
                    positionChat = positionSouris;
                    sourisAttrape = true;
                }else {
                    jeu.placerChat(cible);
                    positionChat = cible;
                }
            }
            choix++;
        }
        if(sourisAttrape){
            jeu.afficherInformation("Le chat a gagné car la souris a été attrapé");
        }else {
            jeu.afficherInformation("La souris a gagné, elle s'est caché");
        }
        System.out.println("Jeu terminé");;
    }
}
