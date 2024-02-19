/**
 * Classe Relation héritant de RelationDeBase
 * Fournit des outils de manipulation des relations entre sous-ensembles de l'Univers
 */

import java.util.*;

public class Relation extends RelationDeBase {

    /**
     * Valeur numérique de MAXELT
     */
    private static final int MAX = Elt.MAXELT.val();

    /**
     * Construit la Relation vide sur l'ensemble vide
     */
    public Relation() {
        super();
    }

    /**
     * Construit la Relation vide de d vers a
     */
    public Relation(EnsembleAbstrait d, EnsembleAbstrait a) {
        super(d, a);
    }

    /**
     * Clone
     */
    public Relation clone() {
        return (Relation) super.clone();
    }

    //Ex1
    //renvoie le domaine de la relation courante
    public EnsembleAbstrait domaine() {
        //TODO
        EnsembleAbstrait domaine = new Ensemble();
        for (Couple c : this) {
            domaine.ajouter(c.getX());
        }
        return domaine;
    }

    //renvoie l'image de la relation courante
    public EnsembleAbstrait image() {
        EnsembleAbstrait domaine = new Ensemble();
        for (Couple c : this) {
            domaine.ajouter(c.getY());
        }
        return domaine;
    }

    // EX 2
    // renvoie la complémentaire de la relation courante
    public Relation complementaire() {
        Relation r = new Relation(depart(), arrivee());
        for (Elt x : depart()) {
            System.out.println("x " + x.val());
            for (Elt y : arrivee()) {
                System.out.println("y " + y.val());
                Couple couple = new Couple(x, y);
                if (!contient(couple)) {
                    r.ajouter(couple);
                }
                System.out.println(couple);
            }
        }
        for (Couple couple : r) {
            System.out.println("Snif -> " + couple);
        }
        System.out.println(r);
        return r;
    }

    // renvoie la réciproque de la relation courante
    public Relation reciproque() {
        //TODO
        Relation relation = new Relation(arrivee(), depart()); // attention l'ordre est inversée donc le départ devient l'arrivée et vice versa

        for (Couple couple : this) {
            relation.ajouter(couple.getY(), couple.getX());
            // relation.ajouter(couple.reciproque());
        }
        return relation;
    }

    // si possible, remplace la relation courante par son union avec r
    //sinon, lance une IllegalArgumentException
    public void ajouter(RelationInterface r) {
        if (r == null) throw new IllegalArgumentException("Relation est null");
        if (!r.arrivee().equals(this.arrivee())) throw new IllegalArgumentException("Ensemble d'arrivée différentes");
        if (!r.depart().equals(this.depart())) throw new IllegalArgumentException("Ensemble de départ différentes");
        for (Couple couple : r) {
            this.ajouter(couple);
        }
        //TODO
    }

    // si possible, remplace this par sa différence avec r
    //sinon, lance une IllegalArgumentException
    public void enlever(RelationInterface r) {
        if (r == null) throw new IllegalArgumentException("Relation est null");
        if (!r.arrivee().equals(this.arrivee())) throw new IllegalArgumentException("Ensemble d'arrivée différentes");
        if (!r.depart().equals(this.depart())) throw new IllegalArgumentException("Ensemble de départ différentes");


        for (Couple couple : this.clone()) {
            if (r.contient(couple)) {
                this.enlever(couple);
            }
        }
    }

    // si possible, remplace this par son intersection avec r
    //sinon, lance une IllegalArgumentException
    public void intersecter(RelationInterface r) {
        if (r == null) throw new IllegalArgumentException("Relation est null");
        if (!r.arrivee().equals(this.arrivee())) throw new IllegalArgumentException("Ensemble d'arrivée différentes");
        if (!r.depart().equals(this.depart())) throw new IllegalArgumentException("Ensemble de départ différentes");

        for (Couple couple : this.clone()) {
            if (!r.contient(couple)) {
                this.enlever(couple);
            }
        }

    }

    // si possible, renvoie la composée : this après r
    //sinon, lance une IllegalArgumentException
    public Relation apres(RelationInterface r) {
        if (r == null || !r.arrivee().equals(this.depart())) {
            throw new IllegalArgumentException();
        }
        Relation relation = new Relation(r.depart(), arrivee());
        for (Couple c1 : r) {
            //etape 1 on regarde ce qui part de r
            for (Couple c2 : this) {
                // etape 2 on regarde ce qui part de this
                if (c1.getY().equals(c2.getX())) {
                    relation.ajouter(c1.getX(), c2.getY());
                }
            }
        }
        return relation;
    }



    /*Les exercices 4 et 5 ne concernent que les relations sur un ensemble.
     * Les méthodes demandées génèreront donc une MathException lorsque l'ensemble de départ
     * ne coïncide pas avec l'ensemble d'arrivée.
     */

    /* Ex 4 */

    // Clôture la Relation courante pour la réflexivité
    public void cloReflex() {
        //TODO
        if (!depart().equals(arrivee())) {
            throw new MathException();
        }

        for (Elt elt : arrivee()) {
            if (!contient(elt, elt)) {
                ajouter(elt, elt);
            }
        }

    }

    // Clôture la Relation courante pour la symétrie
    public void cloSym() {
        //TODO
        if (!depart().equals(arrivee())) {
            throw new MathException();
        }

        for (Couple couple : clone()) {
            if (!couple.getX().equals(couple.getY())) {
                System.out.println("couple " + couple.getX().val() + " -> " + couple.getY().val());
                System.out.println("ajoute " + couple.getY().val() + " -> " + couple.getX().val());
                ajouter(couple.getY(), couple.getX());
            }
        }
    }

    // Clôture la Relation courante pour la transitivité (Warshall)
    int iter = 0;

    // avec recursivité (iterations variable)
    public void cloTrans() {
        if (!depart().equals(arrivee())) {
            throw new MathException();
        }

        // Methode Warshall
        // 1) regarder fleche qui rentre
        for (Couple c1 : this) {
            Elt x1 = c1.getX();
            Elt y1 = c1.getY();
            // exemple (3 -> 2)
            // on garde 3 (x) et on garde 2 (y)
            for (Couple c2 : this) {
                // on reparcoure les couples et on check si le y (2) == x du nouveau couple
                if (c2.getX().equals(y1)) {
                    Elt y2 = c2.getY();
                    if (!contient(x1, y2)) {
                        ajouter(x1, y2);
                        // Si réussi on reparcoure tout de zero pour rafraichir les potentiels changements
                        cloTrans();
                        return;
                    }
                }
                iter++;
            }
        }
        System.out.println(iter+" iterations");
    }

    // ou cloTrans sans recursivité (iteration moins variable q)
    public void cloTrans_sans_recu() {
        int iter = 0;
        if (!depart().equals(arrivee())) throw new MathException();
        for (Elt k : arrivee()) {
            for (Elt i : arrivee()) {
                for (Elt j : arrivee()) {
                    if (contient(i, k) && contient(k, j)) {
                        ajouter(i, j);
                    }
                    iter++;
                }
            }
        }
        System.out.println(iter+" iterations");
    }

    public void cloTrans_apres(){
        if (!depart().equals(arrivee())) throw new MathException();
        for (int i = 0; i < MAX; i++) {
            ajouter(apres(this));

        }
    }




    //Ex 5
    /*Les questions qui suivent ne concernent que les relations sur un ensemble.
     * Les méthodes demandées génèreront donc une MathException lorsque l'ensemble de départ
     * ne coïncide pas avec l'ensemble d'arrivée.
     */
    // renvoie true ssi this est réflexive
    public boolean reflexive() {
        //TODO
        return false;
    }

    // renvoie true ssi this est antiréflexive
    public boolean antireflexive() {
        //TODO
        return false;
    }

    // renvoie true ssi this est symétrique
    public boolean symetrique() {
        //TODO
        return false;
    }

    // renvoie true ssi this est antisymétrique
    public boolean antisymetrique() {
        //TODO
        return false;
    }

    // renvoie true ssi  this est transitive
    public boolean transitive() {
        //TODO
        return false;
    }

    // Ex 6
    //Construit une copie de la relation en paramètre
    //lance une IllegalArgumentException en cas de paramètre invalide
    public Relation(RelationInterface r) {
        //TODO
        this();

    }

    //renvoie l'identité sur e
    //lance une IllegalArgumentException en cas de paramètre invalide
    public static Relation identite(EnsembleAbstrait e) {
        //TODO
        return null;
    }

    //renvoie le produit cartésien de a et b
    //lance une IllegalArgumentException en cas de paramètre invalide
    public static Relation produitCartesien(EnsembleAbstrait a, EnsembleAbstrait b) {
        //TODO
        return null;
    }

} // class Relation
