package com.callor.memo.mapper.sql;

public class MemoSQL {
	// myBatis 에서 사용할 SQL 명령문은 static 필요
	public static final String MEMO_INSERT 
			= " INSERT INTO tbl_memo("
			+ " m_seq, m_writer, m_date, m_subject, m_content) "
			+ " VALUES("
			+ " seq_memo.NEXTVAL ,#{m_writer} , #{m_date} ,"
			+ " #{m_subject} , #{m_content} ) ";
	
	public static final String MEMO_UPDATE 
			= " UPDATE tbl_memo "
					+ " SET m_writer = #{m_writer}, "
					+ "  m_date = #{m_date}, "
					+ "  m_subject = #{m_subject}, "
					+ "  m_content = #{m_content} "
					+ " WHERE m_seq = #{m_seq} ";
	

}
