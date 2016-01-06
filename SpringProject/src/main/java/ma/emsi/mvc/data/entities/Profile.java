package ma.emsi.mvc.data.entities;

public class Profile {

	private int identifiant;
	private String typeProfile;

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getTypeProfile() {
		return typeProfile;
	}

	public void setTypeProfile(String typeProfile) {
		this.typeProfile = typeProfile;
	}

	public Profile(int identifiant, String typeProfile) {
		super();
		this.identifiant = identifiant;
		this.typeProfile = typeProfile;
	}

	public Profile() {
		super();
	}

}