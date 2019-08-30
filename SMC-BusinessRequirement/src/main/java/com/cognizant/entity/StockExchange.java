package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Stock_Exchange")
public class StockExchange {

	public StockExchange() {
		super();
	}
	
	@Id @NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Stock_Exchange_Id")
	private int stockExchangeId;
	
	@NotNull
	@Column(name="Stock_Exchange_Name")
	private String stockExchangeName;
	
	@NotNull
	@Column(name="Stock_Exchange_Brief")
	private String stockExchangeBrief;
	
	@NotNull
	@Column(name="Stock_Exchange_Contact_Address")
	private String stockExchangeContactAddress;
	
	@NotNull
	@Column(name="Stock_Exchange_Remark")
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
