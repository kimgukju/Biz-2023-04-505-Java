
package com.callor.classes.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StudentExecC {
	
	public static void main(String[] args) {
		
		String studentFile = "src/com/callor/classes/datas/student.csv";
		String saveFile = "src/com/callor/classes/datas/student-save.csv";
		
		Scanner fileScan = null;
		
		InputStream is = null;
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileScan = new Scanner(is); // System.in
		while(fileScan.hasNext()) {
			System.out.println(fileScan.nextLine());
		}
		fileScan.close();
	}

}
