package  ma.emsi.mvc.data.entities;

import java.util.Date;

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