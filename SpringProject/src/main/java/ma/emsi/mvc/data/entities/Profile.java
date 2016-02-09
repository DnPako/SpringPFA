package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Profile {

	@Id
	@GeneratedValue
	@Column(name = "Profile_ID")
	private int identifiant;
	@Column(name = "TYPE", length = 15, unique = true, nullable = false)
	private String typeProfile = UserProfileType.ADMIN.getUserProfileType();

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

	public Profile(String typeProfile) {
		super();
		this.typeProfile = typeProfile;
	}

	public Profile() {
		super();
	}

}
