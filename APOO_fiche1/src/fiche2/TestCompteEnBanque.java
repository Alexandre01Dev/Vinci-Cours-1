package fiche2;

public class TestCompteEnBanque {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Leconte","Julien", new Date(12,1,2002), new Adresse("rue", "0", "ville", "0"));
        CompteEnBanque compte1 = new CompteEnBanque(personne1, 1200, new Date(3,10,2023), new Date(10,4,2040),"000-000000089-89");
        System.out.println(compte1);

        compte1.depotSolde(100);
        System.out.println(compte1);


        if(!compte1.retraitSolde(1450)){
            System.out.println("Retrait impossible");
        }else {
            System.out.println("Retrait accomplit");
        }

        System.out.println(compte1);


        //création d'un compte secondaire pour la même personne
        CompteEnBanque compte2 = new CompteEnBanque(personne1, 1000, new Date(3,10,2023), new Date(10,4,2040),"000-00000234-89");

        // virement
        if(!compte1.virement(compte2, 250)){
            System.out.println("Virement impossible");
        }else {
            System.out.println("Virement accomplit");
        }

        System.out.println(compte1);
        System.out.println("A -> ");
        System.out.println(compte2);
    }
}
