package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Sector")
public class Sector {
	
	public Sector() {
		super();
	}
	
	@Id @NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Sector_Id")
	private int sectorId;
	
	@NotNull
	@Column(name="Sector_Name")
	private String sectorName;
	
	@NotNull
	@Column(name="Sector_Brief")
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
