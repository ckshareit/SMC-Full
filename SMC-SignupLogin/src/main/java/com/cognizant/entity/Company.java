package com.cognizant.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Company")
public class Company {

	@Id @NotNull
	@Column(name="Company_Name")
	private String companyName;

	@NotNull
	@Column(name="Company_Turnover")
	private double companyTurnover;
	
	@NotNull
	@Column(name="Company_CEO")
	private String companyCeo;
	
	@NotNull
	@Column(name="Company_Board_Of_Directors")
	private String[] companyBoardOfDirectors;
		
	@NotNull
	@Column(name="Company_Brief_Writeup")
	private String companyBriefWriteup;
	
	@NotNull
	@Column(name="Activation_Status")
	private boolean activated;
	

	
	/*
	 * @OneToMany private List<StockExchange> stockExchange = new
	 * ArrayList<StockExchange>();
	 */
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getCompanyTurnover() {
		return companyTurnover;
	}

	public void setCompanyTurnover(double companyTurnover) {
		this.companyTurnover = companyTurnover;
	}

	public String getCompanyCeo() {
		return companyCeo;
	}

	public void setCompanyCeo(String companyCeo) {
		this.companyCeo = companyCeo;
	}

	public String[] getCompanyBoardOfDirectors() {
		return companyBoardOfDirectors;
	}

	public void setCompanyBoardOfDirectors(String[] companyBoardOfDirectors) {
		for(int index = 0 ; index < companyBoardOfDirectors.length ; index++)
		{
			this.companyBoardOfDirectors[index] = companyBoardOfDirectors[index];
		}
	}

	public String getCompanyBriefWriteup() {
		return companyBriefWriteup;
	}

	public void setCompanyBriefWriteup(String companyBriefWriteup) {
		this.companyBriefWriteup = companyBriefWriteup;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	

	/*
	 * public Sector getSector() { return sector; }
	 * 
	 * public void setSector(Sector sector) { this.sector = sector; }
	 * 
	 * public List<StockExchange> getStockExchange() { return stockExchange; }
	 * 
	 * public void setStockExchange(List<StockExchange> stockExchange) {
	 * this.stockExchange = stockExchange; }
	 */
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyTurnover=" + companyTurnover + ", companyCeo="
				+ companyCeo + ", companyBoardOfDirectors=" + Arrays.toString(companyBoardOfDirectors)
				+ ", companyBriefWriteup=" + companyBriefWriteup + ", activated=" + activated + "]";
	}

	
}
