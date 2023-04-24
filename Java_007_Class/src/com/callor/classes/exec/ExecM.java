package com.callor.classes.exec;

//import com.callor.classes.module.ServiceA;
import com.callor.classes.module.ServiceD;

public class ExecM {

	public static void main(String[] args) {
		int rndNum1 = (int) (Math.random() * 50) + 51;
		int rndNum2 = (int) (Math.random() * 50) + 51;

		ServiceD serviceD = new ServiceD();
		serviceD.add(rndNum1, rndNum2);

		// ServiceA serviceA = new ServiceA();
		// int result = serviceA.add(rndNum1,rndNum2);
		// System.out.printf("\n(serviceA사용) %d + %d = %d",rndNum1,rndNum2,result);
	}

}
