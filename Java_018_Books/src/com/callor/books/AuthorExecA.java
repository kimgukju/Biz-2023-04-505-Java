package com.callor.books;

import com.callor.books.data.service.AuthorService;
import com.callor.books.data.service.impl.AuthorServiceImpleV1;

public class AuthorExecA {
	
	public static void main(String[] args) {
		AuthorService auService = new AuthorServiceImpleV1();
		auService.loadAuthor();
		auService.printAuthorList();
		auService.getAuthorList();
	}

}
