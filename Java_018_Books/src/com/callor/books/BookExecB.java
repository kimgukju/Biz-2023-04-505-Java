package com.callor.books;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Repeatable;
import java.util.List;
import java.util.Scanner;

public class BookExecB {
	// ISBN,도서명,출판사,저자,발행일,페이지,가격
	// 0,      1     2     3    4       5     6 
	/*
	 * 도서정보.txt 파일을 열어서 각 line 을 읽어 들인 후 index 0 부터 index 8번까지 데이터를 console에 출력해 보기
	 */

	public static void main(String[] args) {
		String bookFile = "src/com/callor/books/data/도서정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(bookFile + " 파일이 없습니다");
		}
		/*
		 * InputStream(FileInputStream)를 사용하여
		 * 직접 파일 내용을 읽을 수 있다.
		 * 하지만 그 절차가 상당히 많은 코딩을 해야한다.
		 * 좀더 쉽게 text 파일을 읽어서 메모리로 가져오기 위해 
		 * Scanner 도구를 연결하여 사용하는 것이다
		 */

		scan = new Scanner(is);
		System.out.println("=".repeat(100));
		System.out.println("ISBN,도서명,출판사,저자,발행일,페이지,가격");
		System.out.println("=".repeat(100));
		
		int rows = 0;
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] book = line.split(",");
			
			rows ++;
			if(book.length < 7) {
				System.out.printf("%d 번째 현재 데이터 문제\n",rows);
				System.out.println(line);
				break;
			} else {
				System.out.printf("%s\t",book[0]);
				System.out.printf("%s\t",book[1]);
				System.out.printf("%s\n",book[2]);
			}
		}
		scan.close();


		

	}

}
