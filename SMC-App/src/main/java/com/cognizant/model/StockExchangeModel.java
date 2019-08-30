package com.cognizant.model;



public class StockExchangeModel {

	private int stockExchangeId;
	private String stockExchangeName;
	private String stockExchangeBrief;
	private String stockExchangeContactAddress;
	private String stockExchangeRemark;

	public int getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getStockExchangeBrief() {
		return stockExchangeBrief;
	}

	public void setStockExchangeBrief(String stockExchangeBrief) {
		this.stockExchangeBrief = stockExchangeBrief;
	}

	public String getStockExchangeContactAddress() {
		return stockExchangeContactAddress;
	}

	public void setStockExchangeContactAddress(String stockExchangeContactAddress) {
		this.stockExchangeContactAddress = stockExchangeContactAddress;
	}

	public String getStockExchangeRemark() {
		return stockExchangeRemark;
	}

	public void setStockExchangeRemark(String stockExchangeRemark) {
		this.stockExchangeRemark = stockExchangeRemark;
	}

	
	@Override
	public String toString() {
		return "StockExchange [stockExchangeId=" + stockExchangeId + ", stockExchangeName=" + stockExchangeName
				+ ", stockExchangeBrief=" + stockExchangeBrief + ", stockExchangeContactAddress="
				+ stockExchangeContactAddress + ", stockExchangeRemark=" + stockExchangeRemark + "]";
	}
		
}
