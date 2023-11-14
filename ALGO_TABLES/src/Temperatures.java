import java.util.Arrays;

public class Temperatures {

	private String mois;
	private double[] tableDesTemperatures;
	
	// A NE PAS MODIFIER
	public Temperatures(String mois, double [] tableARecopier) {
		if(tableARecopier == null)
			throw new IllegalArgumentException();
		if(tableARecopier.length == 0)
			throw new IllegalArgumentException();
		this.mois = mois;
		this.tableDesTemperatures = new double[tableARecopier.length];
		for (int i = 0; i < tableARecopier.length; i++) {
			this.tableDesTemperatures[i]=tableARecopier[i];
		}
	}

	// A NE PAS MODIFIER
	public String toString(){
		String aRenvoyer = "temperatures du mois de " + this.mois + " : \n";
		return aRenvoyer + Arrays.toString(tableDesTemperatures);
	}


	/**
	 * calcule la moyenne des temperatures
	 * @return la moyenne
	 */
	public double moyenne(){
		//TODO
		double somme = 0;
		for (double tableDesTemperature : tableDesTemperatures) {
			somme+= tableDesTemperature;
		}

		return somme/tableDesTemperatures.length;
	}


	/**
	 * recherche la temperature la plus basse
	 * precondition (a ne pas verifier) la table des temperatures est non vide
	 * @return la temperature la plus basse
	 */
	public double temperatureMin(){
		// TODO

		// in stream java 8
		/*return Arrays.stream(tableDesTemperatures).min().orElseThrow(() -> {
			return new RuntimeException("There is no temperatures");
		});*/

		double min = Double.MAX_VALUE;
		for (double tableDesTemperature : tableDesTemperatures) {
			if(min >= tableDesTemperature){
				min = tableDesTemperature;
			}
		}

		return min;
	}


	/**
	 * calcule le nombre de temperatures negatives (< 0)
	 * @return le nombre de jours de gel
	 */
	public int nombreJoursDeGel(){
		// In java 8 stream
		//return (int) Arrays.stream(tableDesTemperatures).filter(value -> value <= 0).count();
		// TODO

		int count = 0;
		for (double tableDesTemperature : tableDesTemperatures) {
			if(tableDesTemperature <= 0){
				count++;
			}
		}
		return count;
	}


	/**
	 * remplit une table avec les numeros des jours de gel
	 * @return une table avec les jours de gel, la dimension de cette table correspond a ce nombre de jours
	 */
	public int[] joursDeGel(){
		//TODO
		// Attention, la dimension des tables renvoyees doivent TOUJOURS correspondre au nombre de donnees
		int[] joursDeGel = new int[nombreJoursDeGel()];
		int jour = 1;
		int index = 0;
		for (double temperature: tableDesTemperatures) {
			if(temperature < 0){
				joursDeGel[index] = jour;
				index++;
			}
			jour++;
		}
		return joursDeGel;
	}


	/**
	 * verifie si toutes les temperatures sont positives
	 * @return true si toutes les temperatures sont positives, false sinon
	 */
	public boolean toutesPositives(){
		//TODO
		// Pour une question d'efficacite, n'utilisez pas la methode nombreJoursDeGel()!
		// Il n'est peut-etre pas necessaire de parcourir toute la table pour cette methode

		for (double tableDesTemperature : tableDesTemperatures) {
			if(tableDesTemperature < 0){
				return false;
			}
		}
		return true;
	}


	/**
	 * verifie la presence d'au moins une temperature negative (<0)
	 * @return true si la table contient au moins une temperature negative, false sinon
	 */
	public boolean contientAuMoinsUnJourDeGel(){
		//TODO
		// Pour une question d'efficacite, n'utilisez pas la methode nombreJoursDeGel()!
		// Par contre, reflechissez ! Ne serait-il pas possible d'utiliser la methode toutesPositives() ?
		return !toutesPositives();
	}


	/**
	 * verifie la presence d'au moins une temperature superieure a la temperature passee en parametre
	 * @param temperature la temperature qui sert a cette recherche
	 * @return true si la table contient au moins une temperature superieure a temperature, false sinon
	 */
	public boolean contientAuMoinsUneTemperatureSuperieureA(double temperature){
		//TODO
		// Ex supplementaire
		for (double iterOfTemp : tableDesTemperatures) {
			if(iterOfTemp > temperature){
				return true;
			}
		}
		return false;
	}


	/**
	 * recherche la temperature la plus elevee
	 * precondition (a ne pas verifier) la table des temperatures est non vide
	 * @return la temperature la plus elevee
	 */
	public double temperatureMax(){
		//TODO
		double max = Double.MIN_VALUE;
		for (double tableDesTemperature : tableDesTemperatures) {
			if(tableDesTemperature > max){
				max = tableDesTemperature;
			}
		}
		return max;
	}


	/**
	 * remplit une table avec les numeros des jours correspondant a la temperature la plus elevee
	 * @return une table avec les jours de haute temperature, la dimension de cette table correspond à ce nombre de jours
	 */
	public int[] joursMax(){
		final double tempMax = temperatureMax();
		int jours = 0;
		for (double temperature : tableDesTemperatures) {
			if(tempMax == temperature){
				jours++;
			}
		}

		final int[] table = new int[jours];
		jours = 0;

		for (int i = 0; i < tableDesTemperatures.length; i++) {
			double temp = tableDesTemperatures[i];

			if(temp == tempMax){
				table[jours] = i+1;
				jours++;
			}
		}
		return table;
	}





	/**
	 * remplit une table avec les numeros des jours correspondant a la temperature la plus basse
	 * @return une table avec les jours de basse temperature, la dimension de cette table correspond à ce nombre de jours
	 */
	public int[] joursMin(){

		//TODO
		// Ex supplementaire
		// Suggestion : introduisez la methode nombreJours(double temperature)
		// Les methodes joursDeGel(), joursMax() peuvent aussi utiliser cette methode
		//
		final double tempMin = temperatureMin();
		final int[] table = new int[nombreJours(tempMin)];
		int jours = 0;

		for (int i = 0; i < tableDesTemperatures.length; i++) {
			double temp = tableDesTemperatures[i];

			if(temp == tempMin){
				table[jours] = i+1;
				jours++;
			}
		}
		return table;
	}

	public int nombreJours(double temperature){
		int jours = 0;
		for (double temp : tableDesTemperatures) {
			if(temp == temperature){
				jours++;
			}
		}
		return jours;
	}
}
