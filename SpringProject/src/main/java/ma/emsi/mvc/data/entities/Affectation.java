package  ma.emsi.mvc.data.entities;

import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Affectation {

	@Id
	@GeneratedValue
	@Column(name = "Affectation_ID")
	private int identifiant;
	private Date dateAffectation;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Profile_ID", nullable = false)
	private Profile m_Profile;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Camion_ID", nullable = false)
	public Camion m_Camion;
	
	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public Date getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}

	public Profile getM_Profile() {
		return m_Profile;
	}

	public void setM_Profile(Profile m_Profile) {
		this.m_Profile = m_Profile;
	}

	public Camion getM_Camion() {
		return m_Camion;
	}

	public void setM_Camion(Camion m_Camion) {
		this.m_Camion = m_Camion;
	}

	public Affectation(){

	}

	public Affectation(Date dateAffectation, Profile m_Profile, Camion m_Camion) {
		super();
		this.dateAffectation = dateAffectation;
		this.m_Profile = m_Profile;
		this.m_Camion = m_Camion;
	}


}