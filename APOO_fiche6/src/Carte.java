import java.util.ArrayList;
import java.util.List;

public class Carte {
    //ajouter une boisson (il ne faut pas de doublon) ;
    //• retirer une boisson ;
    //• voir si une boisson est présente ou non sur la carte ;
    //• donner le nombre de boissons de la carte ;
    //• récupérer les informations de la carte sous forme textuelle

    private List<Boisson> boissons = new ArrayList<>();

    public boolean ajouter(Boisson boisson){
        if(!boissons.contains(boisson)){
            boissons.add(boisson);
            return true;
        }
        return false;
    }

    public boolean retirer(Boisson boisson){
        if(boissons.contains(boisson)){
            boissons.remove(boisson);
            return true;
        }
        return false;
    }

    public boolean contient(Boisson boisson){
        return boissons.contains(boisson);
    }

    public int nombreDeBoissons(){
        return boissons.size();
    }
    public String toString(){
        String s = "";
        for(Boisson boisson : boissons){
            s += boisson.toString() + "\n";
        }
        return s;
    }
}
