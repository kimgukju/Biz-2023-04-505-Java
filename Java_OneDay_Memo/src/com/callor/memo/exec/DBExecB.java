package com.callor.memo.exec;

import java.util.Scanner;

import com.callor.memo.service.MemoService;
import com.callor.memo.service.impl.MemoServiceImplV1;

public class DBExecB {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemoService memoService = new MemoServiceImplV1();
//		SqlSession sqlSession = DBConnection.getFactory().openSession(true);
//		MemoDao memoDao = sqlSession.getMapper(MemoDao.class);
		
		
		while(true) {
			System.out.println("=".repeat(100));
			System.out.println("나의 메모장");
			System.out.println("=".repeat(100));
			System.out.println("1.메모 목록 보기");
			System.out.println("2.메모 작성하기");
			System.out.println("3.메모 찾기");
			System.out.println("4.메모 수정하기");
			System.out.println("5.메모 삭제하기");
			System.out.println("9. 그만할래요");
			System.out.print(" 뭐할까용?? >> ");
			String sellect = scan.nextLine();
			
			if(sellect.equals("1")) memoService.printMemoList();
			else if(sellect.equals("2")) memoService.insertMemo();
			else if(sellect.equals("3")) memoService.findMymemo();
 			else if(sellect.equals("4")) memoService.updateMemo();
 			else if(sellect.equals("5")) memoService.deleteMemo();
 			else if(sellect.equals("9")) break;
		}
	}
}
