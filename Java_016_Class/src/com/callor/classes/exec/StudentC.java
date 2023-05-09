package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;

public class StudentC {
	
	public static void main(String[] args) {
		List<StudentDto> stdList = new ArrayList<>();
		
		for(int i=0; i<StdData.STUDENT.length; i++) {
			String[] student = StdData.STUDENT[i].split(",");
			StudentDto stDto = new StudentDto();
			stDto.stNum = student[StdData.ST_NUM];
			stDto.stName = student[StdData.ST_NAME];
			stDto.stDept = student[StdData.ST_DEPT];
			stDto.stGrade = Integer.valueOf(student[StdData.ST_GRADE]);
			stDto.stTel = student[StdData.ST_TEL];
			stDto.stAddress = student[StdData.ST_ADDRESS];
			stdList.add(stDto);
		}
	}

}
