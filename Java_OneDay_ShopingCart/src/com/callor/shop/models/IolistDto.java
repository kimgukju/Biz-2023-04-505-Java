package com.callor.shop.models;

public class IolistDto {
	
	public int ioSEQ;		//NUMBER
	public String ioDate;	//VARCHAR2(10)
	public String ioTime;	//VARCHAR2(10)
	public String ioBuId;	//VARCHAR2(10)
	public String ioPCode;	//VARCHAR2(13)
	public int ioQuan;		//NUMBER
	public int ioPrice;		//NUMBER
	
	
	
	public IolistDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IolistDto(int ioSEQ, String ioDate, String ioTime, String ioBuId, String ioPCode, int ioQuan, int ioPrice) {
		super();
		this.ioSEQ = ioSEQ;
		this.ioDate = ioDate;
		this.ioTime = ioTime;
		this.ioBuId = ioBuId;
		this.ioPCode = ioPCode;
		this.ioQuan = ioQuan;
		this.ioPrice = ioPrice;
	}

	@Override
	public String toString() {
		return "IolistDto [ioSEQ=" + ioSEQ + ", ioDate=" + ioDate + ", ioTime=" + ioTime + ", ioBuId=" + ioBuId
				+ ", ioPCode=" + ioPCode + ", ioQuan=" + ioQuan + ", ioPrice=" + ioPrice + "]";
	}
	
}
