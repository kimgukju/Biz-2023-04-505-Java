package com.callor.score;

public class ScoreDto {
	
	public int intKor;
	public int intEng;
	public int intMath;
	
	
	public String stName;
	public String stNum;
	
	public int scoreTotal() {
		int total = this.intKor;
		total += this.intEng;
		total += this.intMath;
		return total;
	}
	
	public float scoreAvg() {
		float avg = (float)this.scoreTotal()/3;
		return avg;
		
	}

}
