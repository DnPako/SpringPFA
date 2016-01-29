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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
	private Collection<Affectation> affectation = new ArrayList<Affectation>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "destributeur")
	private Collection<Commande> dest = new ArrayList<Commande>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "revendeur")
	private Collection<Commande> rev = new ArrayList<Commande>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "profile_compte", joinColumns = {
			@JoinColumn(name = "Profile_ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Compte_ID", nullable = false, updatable = false) })
	private Collection<Compte> compte = new ArrayList<Compte>();

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "profile")
	private Magasin magasin;

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public Collection<Affectation> getAffectation() {
		return affectation;
	}

	public void setAffectation(Collection<Affectation> affectation) {
		this.affectation = affectation;
	}

	
	public Collection<Commande> getDest() {
		return dest;
	}

	public void setDest(Collection<Commande> dest) {
		this.dest = dest;
	}

	public Collection<Commande> getRev() {
		return rev;
	}

	public void setRev(Collection<Commande> rev) {
		this.rev = rev;
	}

	public Collection<Compte> getCompte() {
		return compte;
	}

	public void setCompte(Collection<Compte> compte) {
		this.compte = compte;
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
