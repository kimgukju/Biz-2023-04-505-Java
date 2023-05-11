package com.callor.books.data.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.data.models.BookDto;
import com.callor.books.data.service.BookService;

public class BookServiceImplV1 implements BookService{
	
	protected List<BookDto> bookList;
	
	public BookServiceImplV1() {
		bookList = new ArrayList<>();
	}
	
	// 도서정보.txt 파일을 읽어와서
	// List<BookDto> type 리스트 데이터로 변환하는 method 
	public void loadBook() {
		String bookFile = "src/com/callor/books/data/도서정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			System.out.println(bookFile + "파일이 없어용");
		}
		
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] booklist = line.split(",");
			
			BookDto bookDto = new BookDto();
				bookDto.setbIsbn(booklist[0]);
				bookDto.setbTitle(booklist[1]);
				bookDto.setbPublisher(booklist[2]);
				bookDto.setbAuthor(booklist[3]);
				bookDto.setbPublishDate(booklist[4]);
				bookDto.setbPages(Integer.valueOf(booklist[5]));
				int strPrice= Integer.valueOf(booklist[6].trim());
				bookDto.setbPrice(strPrice);   // .trime() 사용해서 sapce 값제거해줘야했음
				bookList.add(bookDto);
			
		}
		
		
	}
	
	public void printBookList() {
		System.out.println("=".repeat(120));
		System.out.println("ISBN\t\t도서명\t\t출판사\t\t저자\t\t발행일\t\t페이지\t\t가격");
		System.out.println("=".repeat(120));
		for(int i = 0; i < bookList.size(); i++ ) {
			System.out.print(bookList.get(i).getbIsbn()+ "\t");
			System.out.print(bookList.get(i).getbTitle()+ "\t");
			System.out.print(bookList.get(i).getbPublisher()+ "\t");
			System.out.print(bookList.get(i).getbAuthor()+ "\t");
			System.out.print(bookList.get(i).getbPublishDate()+ "\t");
			System.out.print(bookList.get(i).getbPages()+ "\t");
			System.out.print(bookList.get(i).getbPrice()+ "\n");
			
		}
	}

	@Override
	public BookDto getBook(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub
		
	}

}
