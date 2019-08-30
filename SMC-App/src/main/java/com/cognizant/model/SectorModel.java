package com.cognizant.model;

public class SectorModel {
	
	private int sectorId;
	private String sectorName;
	private String sectorBrief;

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public String getSectorBrief() {
		return sectorBrief;
	}

	public void setSectorBrief(String sectorBrief) {
		this.sectorBrief = sectorBrief;
	}

	@Override
	public String toString() {
		return "Sector [sectorId=" + sectorId + ", sectorName=" + sectorName + ", sectorBrief=" + sectorBrief
				+  "]";
	}

	
}
