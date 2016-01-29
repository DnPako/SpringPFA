package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Compte {

	@GenericGenerator(name = "generator", strategy = "foreign", 
			parameters = @Parameter(name = "property", value = "Profile"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "Compte_ID")
	private int identifiant;
	private String Login;
	private String mdp;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Utilisateur_ID", nullable = false)
	private Utilisateur utilisateur;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "compte")
	private Collection<Profile> profile = new ArrayList<Profile>();
	
	public Collection<Profile> getProfile() {
		return profile;
	}

	public void setProfile(Collection<Profile> m_Profile) {
		this.profile = m_Profile;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public Compte() {

	}

	public Compte(String login, String mdp) {
		super();
		Login = login;
		this.mdp = mdp;
	}

}