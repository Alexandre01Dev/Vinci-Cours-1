import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private List<Livre> livres = new ArrayList<>();
    public Catalogue(){
        // constructeur vide (pas obligatoire)
    }

    /*public boolean contient(String isbn){
        // stream java 8
        // return livres.stream().anyMatch(livre -> livre.getIsbn().equals(isbn));

        // normal java

        for (Livre livre : livres){
            if(livre.getIsbn().equals(isbn)){
                return true;
            }
        }
        return false;
    }*/

    public boolean contient(Livre livre){
       return livres.contains(livre);
    }

    public boolean ajouter(Livre livre){
        if(!contient(livre)){
            livres.add(livre);
            return true;
        }
        return false;
    }

    public boolean retirer(Livre nLivre){
        return livres.remove(nLivre);
    }


    public int nombreDeLivres(){
        return livres.size();
    }

    public boolean estVide(){
        return livres.isEmpty();
    }

    public Livre chercherLivre(String isbn){
        // java 8 (stream) return livres.stream().filter(livre -> livre.getIsbn().equals(isbn)).findFirst().orElse(null);

        for (Livre livre : livres){
            if(contient(livre)){
                return livre;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Livre livre : livres){
            stringBuilder.append(livre.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
