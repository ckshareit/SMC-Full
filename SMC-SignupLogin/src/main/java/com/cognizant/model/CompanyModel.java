package com.cognizant.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompanyModel {

	private String companyName;
	private double companyTurnover;	
	private String companyCeo;
	private String[] companyBoardOfDirectors;
	private String companyBriefWriteup;
	private boolean activated;

//	private List<StockExchangeModel> stockExchangeModel = new ArrayList<StockExchangeModel>();

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
		this.companyBoardOfDirectors = companyBoardOfDirectors;
	}

	public String getCompanyBriefWriteup() {
		return companyBriefWriteup;
	}

	public void setCompanyBriefWriteup(String companyBriefWriteup) {
		this.companyBriefWriteup = companyBriefWriteup;
	}

	public boolean getActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	
	/*
	 * public SectorModel getSectorModel() { return sectorModel; }
	 * 
	 * public void setSectorModel(SectorModel sectorModel) { this.sectorModel =
	 * sectorModel; }
	 * 
	 * public List<StockExchangeModel> getStockExchangeModel() { return
	 * stockExchangeModel; }
	 * 
	 * public void setStockExchangeModel(List<StockExchangeModel>
	 * stockExchangeModel) { this.stockExchangeModel = stockExchangeModel; }
	 * 
	 * @Override public String toString() { return "CompanyModel [companyName=" +
	 * companyName + ", companyTurnover=" + companyTurnover + ", companyCeo=" +
	 * companyCeo + ", companyBoardOfDirectors=" +
	 * Arrays.toString(companyBoardOfDirectors) + ", companyBriefWriteup=" +
	 * companyBriefWriteup + ", activated=" + activated + ", sectorModel=" +
	 * sectorModel + ", stockPriceModel=" + stockPriceModel +
	 * ", stockExchangeModel=" + stockExchangeModel + "]"; }
	 */
}
