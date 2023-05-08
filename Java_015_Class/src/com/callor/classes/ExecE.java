package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.AnimalDto;

public class ExecE {
	
	public static void main(String[] args) {
		
		AnimalDto animalDto = new AnimalDto();
		
		animalDto.setAnName("럭키");
		animalDto.setAnKind("허스키");
		animalDto.setAnAge("5세");
		
		List<AnimalDto> animalList = new ArrayList<>();
		animalList.add(animalDto);
		
		
		animalDto = new AnimalDto("나비","버밀라","3세");
		animalList.add(animalDto);
		animalDto = new AnimalDto("몽","스피츠","7세");
		animalList.add(animalDto);
		
		System.out.println(animalList.toString());
	}

}
