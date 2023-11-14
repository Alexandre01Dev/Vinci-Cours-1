public class DessinCarresEmboités {
    public static void main(String[] args) {
        Tortue tortue = new Tortue();
        tortue.accelerer();
        int cote = 500;
        for (int i = 0; i < cote; i++) {
            for (int j = 0; j < 4; j++) {
                tortue.avancer(cote);
                tortue.tournerADroite(90);
            }
            cote-=10;
        }


    }
}
