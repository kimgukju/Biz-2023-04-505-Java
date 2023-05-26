package com.callor.memo.exec;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import com.callor.memo.config.DBConnection;
import com.callor.memo.mapper.MemoDao;
import com.callor.memo.models.MemoDto;

public class DBExecA {
	
	public static void main(String[] args) {
		SqlSession sqlSession = DBConnection.getFactory().openSession(true);
		MemoDao memoDao = sqlSession.getMapper(MemoDao.class);
		MemoDto memoDto = new MemoDto();
		
//		memoDto.m_seq = 3;
//		memoDto.m_writer = "나";
//		memoDto.m_date = "20230526";
//		memoDto.m_subject = "테스트용3";
//		memoDto.m_content = "테스트용3임다";
//		int result = memoDao.insert(memoDto);
//		if(result > 0) {
//			System.out.println("성공");
//		} else {
//			System.out.println("실패");
//		}
		System.out.println(memoDao.selectAll());
		
		
		
	}

}
