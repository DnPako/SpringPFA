package  ma.emsi.mvc.data.entities;

import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
@AssociationOverrides({
	@AssociationOverride(name = "pk.profile", 
		joinColumns = @JoinColumn(name = "identifiant")),
	@AssociationOverride(name = "pk.camion", 
		joinColumns = @JoinColumn(name = "identifiant")) })
public class Affectation {

	private Date dateAffectation;
	private Profile m_Profile;
	public Camion m_Camion;
	

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