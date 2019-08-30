package com.cognizant.model;

import com.cognizant.entity.Company;

public class CompanyModel {

	private String companyName;

	private double companyTurnover;

	private String companyCeo;

	private String companyBoardOfDirectors;

	private String companyBriefWriteup;

	private String listedInStockExchanges;

	private String StockCodeInStockExchanges;

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
		this.companyBoardOfDirectors = companyBoardOfDirectors;
	}

	public String getCompanyBriefWriteup() {
		return companyBriefWriteup;
	}

	public void setCompanyBriefWriteup(String companyBriefWriteup) {
		this.companyBriefWriteup = companyBriefWriteup;
	}
	public Company modelToEntity(CompanyModel companyModel)
	{
		Company company = new Company();
		
		company.setCompanyName(companyModel.getCompanyName());
		company.setCompanyTurnover(companyModel.getCompanyTurnover());
		company.setCompanyCeo(companyModel.getCompanyCeo());
		company.setCompanyBoardOfDirectors(companyModel.getCompanyBoardOfDirectors());
		company.setListedInStockExchanges(companyModel.getListedInStockExchanges());
		company.setStockCodeInStockExchanges(company.getStockCodeInStockExchanges());
		company.setCompanyBriefWriteup(companyModel.getCompanyBriefWriteup());
		company.setSector(companyModel.getSector());
		
		return company;
		
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyTurnover=" + companyTurnover + ", companyCeo="
				+ companyCeo + ", companyBoardOfDirectors=" + companyBoardOfDirectors + ", companyBriefWriteup="
				+ companyBriefWriteup + ", listedInStockExchanges=" + listedInStockExchanges
				+ ", StockCodeInStockExchanges=" + StockCodeInStockExchanges + ", sector=" + sector + "]";
	}

}
