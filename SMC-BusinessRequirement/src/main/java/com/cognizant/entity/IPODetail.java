package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="IPO_Detail")
public class IPODetail {
	
	public IPODetail() {
		super();
	}
	
	@Id @NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IPO_Id")
	private int ipoId;
	
	@NotNull
	@Column(name="Price_Per_Share")
	private double pricePerShare;
	
	@NotNull
	@Column(name="Total_Number_of_Shares")
	private int totalNumberOfShares;
	
	@NotNull
	@Column(name="Open_Date_Time")
	private String openDateTime;
	
	@NotNull
	@Column(name="IPO_Remarks")
	private String ipoRemarks;

	@NotNull
	@Column(name="Company_Name")
	private String companyName;
	
	@NotNull
	@Column(name="Stock_Exchange_Id")
	private int stockExchangeId;
	
	public int getIpoId() {
		return ipoId;
	}

	public void setIpoId(int ipoId) {
		this.ipoId = ipoId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public int getTotalNumberOfShares() {
		return totalNumberOfShares;
	}

	public void setTotalNumberOfShares(int totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}

	public String getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}

	public String getIpoRemarks() {
		return ipoRemarks;
	}

	public void setIpoRemarks(String ipoRemarks) {
		this.ipoRemarks = ipoRemarks;
	}

	@Override
	public String toString() {
		return "IPODetail [ipoId=" + ipoId + ", companyName=" + companyName + ", stockExchangeId=" + stockExchangeId
				+ ", pricePerShare=" + pricePerShare + ", totalNumberOfShares=" + totalNumberOfShares
				+ ", openDateTime=" + openDateTime + ", ipoRemarks=" + ipoRemarks + "]";
	}

}
