import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Panier implements Iterable<Article> {

    private final ArrayList<Article> articles = new ArrayList<>();
    @Override
    public Iterator<Article> iterator() {
        return articles.iterator();
    }

    public void ajouterArticle(Article article){
        articles.add(article);
    }

    public void supprimerArticle(Article article) {
        articles.remove(article);
    }

    public int getNombreArticles() {
        return articles.size();
    }

    public boolean contientArticle(Article article) {
        return articles.contains(article);
    }
}
