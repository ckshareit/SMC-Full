package com.cognizant.model;

import com.cognizant.entity.IPODetail;

public class IPODetailModel {
	
	private int ipoId;
	private double pricePerShare;
	private int totalNumberOfShares;
	private String openDateTime;
	private String ipoRemarks;
	private String companyName;
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

	public IPODetail modelToEntity(IPODetailModel ipoDetailModel)
	{
		IPODetail ipoDetail = new IPODetail();
		
		ipoDetail.setIpoId(ipoDetailModel.getIpoId());
		ipoDetail.setPricePerShare(ipoDetailModel.getPricePerShare());
		ipoDetail.setTotalNumberOfShares(ipoDetailModel.getTotalNumberOfShares());
		ipoDetail.setOpenDateTime(ipoDetailModel.getOpenDateTime());
		ipoDetail.setIpoRemarks(ipoDetailModel.getIpoRemarks());
		ipoDetail.setCompanyName(ipoDetailModel.getCompanyName());
		ipoDetail.setStockExchangeId(ipoDetailModel.getStockExchangeId());
		
		return ipoDetail;
	}
	@Override
	public String toString() {
		return "IPODetail [ipoId=" + ipoId + ", companyName=" + companyName + ", stockExchangeId=" + stockExchangeId
				+ ", pricePerShare=" + pricePerShare + ", totalNumberOfShares=" + totalNumberOfShares
				+ ", openDateTime=" + openDateTime + ", ipoRemarks=" + ipoRemarks + "]";
	}

}
