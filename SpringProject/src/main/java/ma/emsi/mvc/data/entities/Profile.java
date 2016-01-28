package ma.emsi.mvc.data.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Profile {

	@Id
	@GeneratedValue
	@Column(name = "Profile_ID")
	private int identifiant;
	private String typeProfile;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profile", cascade = CascadeType.ALL)
	private Collection<Affectation> m_Affectation = new ArrayList<Affectation>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "profile")
	private Collection<Commande> m_Commande = new ArrayList<Commande>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "profile_compte", joinColumns = {
			@JoinColumn(name = "Profile_ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Compte_ID", nullable = false, updatable = false) })
	private Collection<Compte> m_Compte = new ArrayList<Compte>();

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "profile", cascade = CascadeType.ALL)
	private Magasin magasin;

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public Collection<Affectation> getM_Affectation() {
		return m_Affectation;
	}

	public void setM_Affectation(Collection<Affectation> m_Affectation) {
		this.m_Affectation = m_Affectation;
	}

	public Collection<Commande> getM_Commande() {
		return m_Commande;
	}

	public void setM_Commande(Collection<Commande> m_Commande) {
		this.m_Commande = m_Commande;
	}

	public Collection<Compte> getM_Compte() {
		return m_Compte;
	}

	public void setM_Compte(Collection<Compte> m_Compte) {
		this.m_Compte = m_Compte;
	}

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
