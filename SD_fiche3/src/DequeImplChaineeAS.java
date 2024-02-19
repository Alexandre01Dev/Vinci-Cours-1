public class DequeImplChaineeAS<E> implements Deque<E>{


    private final Noeud tete ;
    private final Noeud queue ;
    private int taille ;

    public DequeImplChaineeAS(){
        tete=new Noeud(null);
        queue=new Noeud(null);
        tete.suivant=queue;
        queue.precedent=tete;
        taille=0;
    }

    public int taille() {
        return this.taille ;
    }

    public boolean estVide() {
        return (taille==0) ;
    }

    public void ajouterEnPremier(E element) {
        /*
          Cas 1 [/start] -> [a] -> [/end]
          Etape 1  [/start] -> [/end]
            Prendre start.suivant qu'on va appeler aDecaler (dans ce cas /end)
            aDecaler.precedent = nouveau
            start.suivant = nouveau

            [/start] -> [a] -> [/end]
         */
        Noeud noeud = new Noeud(element);
        Noeud aDecaler = tete.suivant; //

        noeud.suivant = aDecaler;
        aDecaler.precedent = noeud;

        tete.suivant = noeud;
        noeud.precedent = tete;
        taille++;
    }

    public E retirerPremier() {
        //TODO
        if(taille == 0){
           throw new DequeVideException();
        }
        Noeud sup = tete.suivant;
        tete.suivant = sup.suivant;
        tete.suivant.precedent = tete;
        taille--;
        return sup.element;
    }


    public void ajouterEnDernier(E element) {
        //TODO
        Noeud noeud = new Noeud(element,queue.precedent, queue);
        Noeud aDecaler = queue.precedent;

        queue.precedent = noeud;
        aDecaler.suivant = noeud;
        taille++;
    }

    public E retirerDernier() throws DequeVideException {
        //TODO
        if(taille == 0){
            throw new DequeVideException();
        }
        Noeud sup = queue.precedent;
        queue.precedent = sup.precedent;
        queue.precedent.suivant = queue;
        taille--;
        return sup.element;
    }

    public E premier()throws DequeVideException {
        if(estVide()){
            throw new DequeVideException();
        }
        return tete.suivant.element;
    }

    public E dernier()throws DequeVideException {
        if(estVide()){
            throw new DequeVideException();
        }
        return queue.precedent.element;
    }


    // A NE PAS MODIFIER --> POUR LES TESTS!!!
    // tete 'a' 'b' 'c' queue : ['a','b','c']
    public DequeImplChaineeAS(Object[] table) {
        if(table == null)
            throw new IllegalArgumentException();
        taille = 0 ;
        tete = new Noeud(null) ;
        queue = new Noeud(null) ;
        tete.suivant=queue;
        queue.precedent=tete;
        if(table.length==0)
            return;
        for (int i = table.length-1; i>=0;i--) {
            this.ajouterTest((E) table[i]) ;
        }
    }

    // A NE PAS MODIFIER --> POUR LES TESTS!!!
    public String toString(){
        String aRenvoyer="";
        Noeud baladeur=tete.suivant;
        int cpt = 0;
        while(baladeur!=queue) {
            cpt++;
            if(cpt>taille){
                aRenvoyer = "boucle infinie dans toString(), chainage a verifier";
            }
            aRenvoyer+=baladeur.element;
            if (baladeur.suivant != queue)
                aRenvoyer += " " ;
            baladeur=baladeur.suivant;
        }
        return aRenvoyer;
    }

    // A NE PAS MODIFIER --> POUR LES TESTS!!!
    public String parcoursInverse(){
        String aRenvoyer="";
        Noeud baladeur=queue.precedent;
        System.out.println("precedent ? " + baladeur.element);
        int cpt = 0;
        while(baladeur!=tete) {
            cpt++;
            if(cpt>taille){
                aRenvoyer = "boucle infinie dans toString(), chainage a verifier";
            }
            aRenvoyer+=baladeur.element;

            if (baladeur.precedent != tete)
                aRenvoyer += " " ;
            baladeur=baladeur.precedent;
        }
        return aRenvoyer;
    }

    // A NE PAS MODIFIER --> POUR LES TESTS!!!
    public void ajouterTest(E element) {
        Noeud nouveauNoeud = new Noeud(element) ;
        nouveauNoeud.suivant = tete.suivant;
        nouveauNoeud.precedent = tete;
        tete.suivant.precedent = nouveauNoeud;
        tete.suivant = nouveauNoeud;
        taille++;
    }


    // classe interne
    private class Noeud{
        private E element;
        private Noeud precedent;
        private Noeud suivant;

        private Noeud(E element){
            this.element = element;
            this.precedent = null ;
            this.suivant = null;
        }

        private Noeud(E element, Noeud precedent, Noeud suivant){
            this.element = element;
            this.precedent = precedent ;
            this.suivant = suivant;
        }
    }
}
