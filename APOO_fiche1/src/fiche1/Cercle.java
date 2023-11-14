package fiche1;

public class Cercle {
    double rayon;

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public double calulerAire(){
        return Math.PI * rayon * rayon;
    }

    public void creer(){
        System.out.println("Création d'un cercle de rayon " + rayon);
        double aire = calulerAire();
        System.out.println(aire);

        if(aire < 1){
            System.out.println("Le cercle est petit");
            return;
        }
        System.out.println("Le cercle est grand");
    }

    @Override
    public String toString() {
        return "Wow mon cercle est de rayon " + rayon + " et son aire est de " + calulerAire() + " !";
    }
}
