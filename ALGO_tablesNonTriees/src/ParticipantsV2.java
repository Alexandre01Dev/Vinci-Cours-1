public class ParticipantsV2 {

    private String[] tableParticipants;
    private int nombreInscrits; 	// taille logique

    // Les nombreInscrits participants occupent les nombreInscrits premieres
    // cases du tableau (pas de trou)
    // l'ordre des participants doit etre conserve

    /**
     * construit un objet Participants
     * au depart, il n'y a pas d'inscrit
     * @param nombreMaxParticipants le nombre maximum de participants
     * @throws IllegalArgumentException il faut au moins 1 participant
     */
    public ParticipantsV2(int nombreMaxParticipants) {
        if (nombreMaxParticipants < 1)
            throw new IllegalArgumentException();
        this.tableParticipants = new String[nombreMaxParticipants];
        this.nombreInscrits = 0;
    }

    /**
     * renvoie le nombre de participants actuellement inscrits
     * @return le nombre de participants actuellement inscrits
     */
    public int getNombreInscrits() {
        return this.nombreInscrits;
    }


    private int trouverIndiceParticipant(String participant){
        //methode private
        //recherche a quel indice se trouve le participant passe en parametre
        //renvoie -1 si le participant n'est pas present
        for (int i = 0; i < nombreInscrits; i++) {
            if(tableParticipants[i].equals(participant))
                return i;
        }
        return -1;
    }

    /**
     * verifie la presence du participant
     * @param participant le nom du participant recherche
     * @return true si le participant est present, false sinon
     * @throws IllegalArgumentException en cas de parametre invalide
     */
    public boolean contientParticipant(String participant){

        if(participant==null||participant.length()==0)
            throw new IllegalArgumentException();

        //TODO

        //Prenez connaissance de la methode trouverIndice()
        // ET UTILISEZ-LA !

        return trouverIndiceParticipant(participant) != -1;

    }

    /**
     * ajoute un participant a la table des participants
     * a condition qu'il ne soit pas deja present
     * et a condition que le nombre maximum de participants ne soit pas atteint
     * @param participant le participant a ajouter
     * @return true si l'ajout a pu se faire, false sinon
     * @throws IllegalArgumentException en cas de parametre invalide
     */
    public boolean ajouterUnParticipant(String participant) {

        if(participant==null||participant.length()==0)
            throw new IllegalArgumentException();

        // TODO
        // TODO
        int indice = trouverIndiceParticipant(participant);
        if(indice != -1)
            return false;

        if(nombreInscrits == tableParticipants.length)
            return false;



        tableParticipants[nombreInscrits] = participant;
        nombreInscrits++;
        return true;

    }

    /**
     * supprime le participant passe en parametre
     * @param participant Le participant a supprimer
     * @return true si la suppression a pu etre faite, false sinon
     * @throws IllegalArgumentException en cas de parametre invalide
     */
    public boolean supprimerUnParticipant(String participant) {

        if(participant==null||participant.length()==0)
            throw new IllegalArgumentException();

        // TODO
        int indice = trouverIndiceParticipant(participant);


        if(indice == -1)
            return false;

        if(nombreInscrits == -1)
            return false;
        supprimerDonnee(indice);
        /*for (int i = indice; i < nombreInscrits-1; i++) {
            tableParticipants[i] = tableParticipants[i+1];
        }*/
        nombreInscrits--;
       // tableParticipants[indice] = tableParticipants[nombreInscrits];

        return true;

        // Pensez a utiliser la methode trouverIndiceParticipant()

        // Prenez sous les yeux le schema du document SchemasAProjeter
        // Si cela ne va pas, refaites le QCM classe ParticipantsV2 sur moovin
	// ou revoyez la video SuppressionV2_demo

    }

    private void supprimerDonnee(String participant,int to, int from){
        // capturer case actuel
        String participantActuel = tableParticipants[from];
        if(participant != null){
            // insertion dans la table
            tableParticipants[from] = participant;
        }
        if(to == from){
            return;
        }
        supprimerDonnee(participantActuel,to,from-1);
    }

    private void supprimerDonnee(int to){
        supprimerDonnee(null,to,nombreInscrits-1);
    }

    // A NE PAS MODIFIER
    // VA SERVIR POUR LES TESTS
    public ParticipantsV2(int nombreParticipants, String[] tableARecopier) {
        this.tableParticipants = new String[nombreParticipants];
        this.nombreInscrits = tableARecopier.length;
        for (int i = 0; i < nombreInscrits; i++)
            this.tableParticipants[i] = tableARecopier[i];
    }

    // A NE PAS MODIFIER
    // VA SERVIR POUR LES TESTS
    public String toString() {
        if(nombreInscrits==0)
            return "[]";
        String aRenvoyer = "["+tableParticipants[0];
        for (int i = 1; i < nombreInscrits; i++)
            aRenvoyer = aRenvoyer + ", " + this.tableParticipants[i];
        return aRenvoyer+"]";
    }



}
