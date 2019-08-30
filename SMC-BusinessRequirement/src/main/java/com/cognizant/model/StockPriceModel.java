package com.cognizant.model;

public class StockPriceModel {
	
	private int stockPriceCode;
	private double currentPrice;
	private String stockPriceDate;
	private String stockPriceTime;

	private int stockExchangeId;
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
