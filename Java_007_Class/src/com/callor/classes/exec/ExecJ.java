package com.callor.classes.exec;

import com.callor.classes.module.ServiceA;

public class ExecJ {
	public static void main(String[] args) {
			int rndNum1 = (int)(Math.random()*50) + 51;
			int rndNum2 = (int)(Math.random()*50) + 51;
			ServiceA svA = new ServiceA();
			int result = svA.add(rndNum1, rndNum2);
			System.out.printf("%d + %d = %d", rndNum1, rndNum2, result);
	}
}
