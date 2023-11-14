import java.util.Objects;

public class Article {
	private String reference;
	private String nom;
	private String description;
	private double prixHTVA;
	private double tauxTVA;

	private final static double TAUX_TVA = 21;

	public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA) throws IllegalArgumentException {
		if(reference == null || reference.isEmpty())
			throw new IllegalArgumentException("La référence ne peut pas être vide");

		if(nom == null || nom.isEmpty())
			throw new IllegalArgumentException("Le nom ne peut pas être vide");

		if(prixHTVA <= 0)
			throw new IllegalArgumentException("Le prix HTVA doit être positif");

		if(tauxTVA <= 0 || tauxTVA >= 100)
			throw new IllegalArgumentException("Le taux de TVA doit être compris entre 0 et 100");

		setTauxTVA(tauxTVA);
		setDescription(description);
		setPrixHTVA(prixHTVA);
		this.reference = reference;
		this.nom = nom;
	}
	
	public Article(String reference, String nom, String description,
			double prixHTVA) {
		this(reference,nom,description,prixHTVA,TAUX_TVA);
	}

	public String getReference() {
		return reference;
	}

	public String getNom() {
		return nom;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixHTVA() {
		return prixHTVA;
	}
	
	public void setPrixHTVA(double prixHTVA) {
		this.prixHTVA = prixHTVA;
	}

	public double getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(double tauxTVA) {
		this.tauxTVA = tauxTVA;
	}


	public double calculerPrixTVAComprise() {
		return prixHTVA * (1+ tauxTVA/100);
	}

	public double calculerPrixTVAComprise(int reduction) throws IllegalArgumentException {
		if(reduction < 0 || reduction > 100)
			throw new IllegalArgumentException("La réduction doit être comprise entre 0 et 100");
		return calculerPrixTVAComprise() * (1-reduction/100.0);
	}

	public String toString() {
		return "Référence : " + reference + "\nNom : " + nom + " (prix HTVA : " + prixHTVA + ", taux de TVA : " + tauxTVA +"%)";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Article article = (Article) o;
		return reference.equals(article.reference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reference);
	}
}
