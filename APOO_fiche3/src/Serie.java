public class Serie {
    char nom;
    Etudiant delegue;

    public Serie(char nom) {
        this.nom = nom;
    }

    public void elireDelegue(Etudiant delegue) {
        if(this.delegue == null && delegue.getSerie() == this) {
            this.delegue = delegue;
        }
    }

    public char getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Série " + nom + " (délégué : " + delegue + ")";
    }
}
