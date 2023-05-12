package com.callor.books;

import com.callor.books.data.service.PublisherService;
import com.callor.books.data.service.impl.PubliserServiceImplV1;

public class PublisherExecA {
	
	public static void main(String[] args) {
		PublisherService pubService = new PubliserServiceImplV1();
		pubService.loadPubliser();
		pubService.printPubliser();
		pubService.getPubliserList();
		System.out.println(pubService.getPubliserListByName("나"));
	}

}
