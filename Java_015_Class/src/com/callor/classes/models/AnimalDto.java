package com.callor.classes.models;

public class AnimalDto {
	
	private String anName;
	private String anKind;
	private String anAge;
	
	
	public AnimalDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnimalDto(String anName, String anKind, String anAge) {
		super();
		this.anName = anName;
		this.anKind = anKind;
		this.anAge = anAge;
	}
	
	
	public String getAnName() {
		return anName;
	}
	public void setAnName(String anName) {
		this.anName = anName;
	}
	public String getAnKind() {
		return anKind;
	}
	public void setAnKind(String anKind) {
		this.anKind = anKind;
	}
	public String getAnAge() {
		return anAge;
	}
	public void setAnAge(String anAge) {
		this.anAge = anAge;
	}
	
	@Override
	public String toString() {
		return "AnimalDto [anName=" + anName + ", anKind=" + anKind + ", anAge=" + anAge + "]";
	}
	
	
	
	
	
	
	
	
	

}
