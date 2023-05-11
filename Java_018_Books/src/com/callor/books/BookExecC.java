package com.callor.books;

import com.callor.books.data.service.BookService;
import com.callor.books.data.service.impl.BookServiceImplV2;

public class BookExecC {
	
	public static void main(String[] args) {
		BookService bookService = new BookServiceImplV2();
		bookService.loadBook();
		bookService.printBookList();
	}

}
