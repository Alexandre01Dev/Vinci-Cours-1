public class TestArticle {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Article a = new Article("ref", "nom", "description", 10.0);
        a.calculerPrixTVAComprise(-4);
        Article b = null;

    }
}
