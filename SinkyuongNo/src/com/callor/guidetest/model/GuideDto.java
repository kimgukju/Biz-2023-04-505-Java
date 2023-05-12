package com.callor.guidetest.model;

public class GuideDto {
	
	public String guideID;
	public String guideName;
	public String guideCount;
	public String guideHow;
	
	
	
	
	public String getGuideID() {
		return guideID;
	}

	public void setGuideID(String guideID) {
		this.guideID = guideID;
	}

	public String getGuideName() {
		return guideName;
	}

	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}

	public String getGuideCount() {
		return guideCount;
	}

	public void setGuideCount(String guideCount) {
		this.guideCount = guideCount;
	}

	public String getGuideHow() {
		return guideHow;
	}

	public void setGuideHow(String guideHow) {
		this.guideHow = guideHow;
	}




	@Override
	public String toString() {
		return "GuideDto [guideID=" + guideID + ", guideName=" + guideName + ", guideCount=" + guideCount
				+ ", guideHow=" + guideHow + "]";
	}
	
	

}
