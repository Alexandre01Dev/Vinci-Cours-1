
public class Membre {
	//Ajoutez un attribut pour garder le nom du membre.
    String nom;
	//Ajoutez un attribut pour garder le prénom du membre.
    String prenom;
	//Ajoutez un attribut pour garder le numéro de téléphone du membre.
    String numeroTelephone;
	//Ajoutez un attribut pour garder, s'il y en a un, le membre qui a parrainé le membre courant.
    Membre parrain;

	
	//Ajoutez un constructeur initialisant le nom, le prénom et le numéro de téléphone du membre.
    public Membre(String nom, String prenom, String numeroTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.parrain = null;
    }

	
	//Ajoutez des getters pour tous les attributs
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }


	//Ajouter un setter pour le numéro de téléphone.
    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }



	//Ajoutez une méthode permettant d'initialiser le parrain.
	//Cette méthode renvoie false si le membre a déjà un parrain ou si le membre passé en paramètre est le membre lui-même. 
	//Sinon, elle initialise le parrain et renvoie true.
    public boolean initialiserParrain(Membre parrain) {
        if(this.parrain != null || this == parrain) return false;
        this.parrain = parrain;
        return true;
    }


	
		
	//Ajoutez une méthode toString qui renverra toutes les informations du membre sous forme textuelle. 
	//Si le membre a un parrain, il faut uniquement reprendre le prénom et le nom du parrain. Sinon, il faut dire que le membre n'a pas de parrain.
    public String toString() {
        if(this.parrain == null) return "Nom : "+this.nom+" Prenom : "+this.prenom+" Numero de telephone : "+this.numeroTelephone+" Pas de parrain";
        return "Nom : "+this.nom+" Prenom : "+this.prenom+" Numero de telephone : "+this.numeroTelephone+" Parrain : "+this.parrain.prenom+" "+this.parrain.nom;
    }





}
