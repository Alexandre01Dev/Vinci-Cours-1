

public class Partie {
    Date date;
    Joueur jBlanc;
    Joueur jNoir;
    double ptsBlanc;
    Tournoi tournoi;
    double ptsNoir;

    public Partie(Date date, Joueur jBlanc, Joueur jNoir, Tournoi tournoi) {
        this.date = date;
        this.jBlanc = jBlanc;
        this.jNoir = jNoir;
        this.tournoi = tournoi;
    }

    public Date getDate() {
        return date;
    }

    public Joueur getJBlanc() {
        return jBlanc;
    }

    public Joueur getJNoir() {
        return jNoir;
    }

    public double getPtsBlanc() {
        return ptsBlanc;
    }

    public double getPtsNoir() {
        return ptsNoir;
    }

    public Tournoi getTournoi() {
        return tournoi;
    }

    public boolean enregistrerPartie(double ptsBlanc) {
        if(ptsBlanc != 0 && ptsBlanc != 0.5 && ptsBlanc != 1)
            return false;
        this.ptsBlanc = ptsBlanc;
        this.ptsNoir = 1-ptsBlanc;
        return true;
    }

    public Joueur recupererGagnant() {
        if(ptsBlanc == 1)
            return jBlanc;
        if(ptsNoir == 1)
            return jNoir;
        return null;
    }

    @Override
    public String toString() {
        return "La partie est crée a partir du tournoi "+ tournoi.getNom()+" et concerne "+ jBlanc.getNom()+" "+jBlanc.getPrenom()+" en tant que joueur blanc et "+jNoir.getNom()+" "+jNoir.getPrenom() + " en tant que joueur noir.";
     }
}
