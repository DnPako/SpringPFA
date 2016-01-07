package ma.emsi.mvc.data.entities;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class Project {
	private Long projectId;

	@Length(min=5, message="The name is too short !")
	private String name;

	@NotBlank(message="You need to add a description !")
	private String description;

	private Sponsor sponsor;

	private BigDecimal authorizedHours;

	private BigDecimal authorizedFunds;

	private String year;

	private boolean special;

	private String type;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Sponsor getSponsor() {
		return sponsor;
	}

	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	public BigDecimal getAuthorizedHours() {
		return authorizedHours;
	}

	public void setAuthorizedHours(BigDecimal authorizedHours) {
		this.authorizedHours = authorizedHours;
	}

	public BigDecimal getAuthorizedFunds() {
		return authorizedFunds;
	}

	public void setAuthorizedFunds(BigDecimal authorizedFunds) {
		this.authorizedFunds = authorizedFunds;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isSpecial() {
		return special;
	}

	public void setSpecial(boolean special) {
		this.special = special;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Project(Long projectId, String name, String description, Sponsor sponsor, BigDecimal authorizedHours,
			BigDecimal authorizedFunds, String year, boolean special, String type) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.description = description;
		this.sponsor = sponsor;
		this.authorizedHours = authorizedHours;
		this.authorizedFunds = authorizedFunds;
		this.year = year;
		this.special = special;
		this.type = type;
	}

	public Project() {
		super();
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", name=" + name + ", description=" + description + ", sponsor="
				+ sponsor + ", authorizedHours=" + authorizedHours + ", authorizedFunds=" + authorizedFunds + ", year="
				+ year + ", special=" + special + ", type=" + type + "]";
	}

}
