package ma.emsi.mvc.data.entities;

public class Marque {

	private int identifiant;
	private String nomMarque;
	private String reference;

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Marque(int identifiant, String nomMarque, String reference) {
		super();
		this.identifiant = identifiant;
		this.nomMarque = nomMarque;
		this.reference = reference;
	}

	public Marque() {
		super();
	}

}
