package com.callor.memo.service.impl;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.callor.memo.config.DBConnection;
import com.callor.memo.mapper.MemoDao;
import com.callor.memo.models.MemoDto;
import com.callor.memo.service.MemoService;

public class MemoServiceImplV1 implements MemoService{
	
	SqlSession sqlSession = DBConnection.getFactory().openSession(true);
	MemoDao memoDao = sqlSession.getMapper(MemoDao.class);
	
	protected List<MemoDto> memoList;
	protected Scanner scan;
	
	public MemoServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public void printMemoList() {
		memoList = memoDao.selectAll();
		System.out.println("메모 List");
		System.out.println("-".repeat(100));
		for(MemoDto memoDto : memoList) {
			System.out.printf("%d\t",memoDto.m_seq);
			System.out.printf("%s\t",memoDto.m_writer);
			System.out.printf("%s\t",memoDto.m_date);
			System.out.printf("%s\t",memoDto.m_subject);
			System.out.printf("%s\n",memoDto.m_content);
		}
		
	}

	@Override
	public void findMymemo() {
		printMemoList();
		
		System.out.println("찾아볼 메모의 번호를 입력해보세요");
		System.out.print("번호 입력 >>");
		String mNum = scan.nextLine();
		System.out.println(memoDao.findBySeq(mNum));
//		System.out.printf("%d번 %s %s %s\n",mNum,
//				memoDao.findBySeq(mNum).m_writer,
//				memoDao.findBySeq(mNum).m_date,
//				memoDao.findBySeq(mNum).m_subject,
//				memoDao.findBySeq(mNum).m_content
//				);
		
		
	}

	@Override
	public void insertMemo() {
		System.out.println("메모입력할게용");
		System.out.print("작성자 >> ");
		String mWriter = scan.nextLine();
		
		System.out.print("작성일 >> ");
		String mDate = scan.nextLine();
		
		System.out.print("제목 >> ");
		String mSubject = scan.nextLine();

		System.out.print("내용 >> ");
		String mContent = scan.nextLine();
		
		MemoDto memoDto = new MemoDto();
		memoDto.m_writer = mWriter;
		memoDto.m_date = mDate;
		memoDto.m_subject = mSubject;
		memoDto.m_content = mContent;
		
		memoDao.insert(memoDto);
	}

	@Override
	public void deleteMemo() {
		printMemoList();
		
		System.out.println("삭제할 메모의 번호를 입력해주세요!");
		System.out.print("번호 입력 >>");
		String mNum = scan.nextLine();
		
		
		// 시간이없어서 대문자 Y 만 입력했을때 삭제하게 구현
		System.out.println("진짜로 삭제할까요??(Y/N)");
		String YesNo = scan.nextLine();
		if(YesNo.equals("Y")) {
			int result = memoDao.delete(mNum);
			if(result > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} else {
			System.out.println("삭제 취소");
		}
		
		
	}

	@Override
	public void updateMemo() {
		printMemoList();
		
		System.out.println("수정할 메모의 번호를 입력해주세요!");
		System.out.print("번호 입력 >>");
		String mNum = scan.nextLine();
		MemoDto memoDto = memoDao.findBySeq(mNum);
		
		System.out.println("수정할 메모입력 할게용");
		System.out.print("메모 수정일 >> ");
		String mDate = scan.nextLine();
		
		System.out.print("제목(수정) >> ");
		String mSubject = scan.nextLine();

		System.out.print("내용(수정) >> ");
		String mContent = scan.nextLine();
		
		memoDto.m_date = mDate;
		memoDto.m_subject = mSubject;
		memoDto.m_content = mContent;
		
		memoDao.update(memoDto);
		
	}

}
