package com.cognizant.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Company")
public class Company {

	public Company() {
		super();
	}


	@Id  @NotNull
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
	private String companyBoardOfDirectors;
		
	@NotNull
	@Column(name="Company_Brief_Writeup")
	private String companyBriefWriteup;
	
	@NotNull
	@Column(name="Listed_In_StockExchanges")
	private String listedInStockExchanges;
	
	
	@NotNull
	@Column(name="Stock_Code_In_StockExchanges")
	private String StockCodeInStockExchanges;
		
	@NotNull
	@Column(name="Sector")
	private String sector;
	
	
	public String getListedInStockExchanges() {
		return listedInStockExchanges;
	}

	public void setListedInStockExchanges(String listedInStockExchanges) {
		this.listedInStockExchanges = listedInStockExchanges;
	}

	public String getStockCodeInStockExchanges() {
		return StockCodeInStockExchanges;
	}

	public void setStockCodeInStockExchanges(String stockCodeInStockExchanges) {
		StockCodeInStockExchanges = stockCodeInStockExchanges;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	
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

	public String getCompanyBoardOfDirectors() {
		return companyBoardOfDirectors;
	}
	
	public void setCompanyBoardOfDirectors(String companyBoardOfDirectors) {
		this.companyBoardOfDirectors=companyBoardOfDirectors;
	}

	public String getCompanyBriefWriteup() {
		return companyBriefWriteup;
	}

	public void setCompanyBriefWriteup(String companyBriefWriteup) {
		this.companyBriefWriteup = companyBriefWriteup;
	}


	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyTurnover=" + companyTurnover + ", companyCeo="
				+ companyCeo + ", companyBoardOfDirectors=" + companyBoardOfDirectors + ", companyBriefWriteup="
				+ companyBriefWriteup + ", listedInStockExchanges=" + listedInStockExchanges
				+ ", StockCodeInStockExchanges=" + StockCodeInStockExchanges + ", sector=" + sector + "]";
	}

}
