package ma.emsi.mvc.data.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compte {

	@Id
	@GeneratedValue
	private int identifiant;
	private String Login;
	private String mdp;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "identifiant", nullable = false)
	private Utilisateur utilisateur;

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