package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Stock_Price")
public class StockPrice {
	
	public StockPrice() {
		super();
	}
	
	@Id @NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Stock_price_code")
	private int stockPriceCode;
		
	@NotNull
	@Column(name="Current_Price")
	private double currentPrice;
	
	@NotNull
	@Column(name="Stock_Price_Date")
	private String stockPriceDate;
	
	@NotNull
	@Column(name="Stock_Price_Time")
	private String stockPriceTime;

	@NotNull
	@Column(name="Stock_Exchange_Id")
	private int stockExchangeId;

	@NotNull
	@Column(name="Company_Name")
	private String companyName;
	
	public int getStockPriceCode() {
		return stockPriceCode;
	}

	public void setStockPriceCode(int stockPriceCode) {
		this.stockPriceCode = stockPriceCode;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getStockPriceDate() {
		return stockPriceDate;
	}

	public void setStockPriceDate(String stockPriceDate) {
		this.stockPriceDate = stockPriceDate;
	}

	public String getStockPriceTime() {
		return stockPriceTime;
	}

	public void setStockPriceTime(String stockPriceTime) {
		this.stockPriceTime = stockPriceTime;
	}

	public int getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "StockPrice [stockPriceCode=" + stockPriceCode + ", currentPrice=" + currentPrice + ", stockPriceDate="
				+ stockPriceDate + ", stockPriceTime=" + stockPriceTime + ", stockExchangeId=" + stockExchangeId
				+ ", companyName=" + companyName + "]";
	}
	
	
	
}
