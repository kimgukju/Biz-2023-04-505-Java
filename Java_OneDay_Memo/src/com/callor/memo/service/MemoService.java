package com.callor.memo.service;

public interface MemoService {
	
	// 메모리스트 출력하기
	public void printMemoList();
	
	// 메모 조회해야 할때 조회할 메모 넘버 찾기
	public void findMymemo();
	
	// 메모 작성하기
	public void insertMemo();
	
	// 메모 삭제하기
	public void deleteMemo();
	
	// 메모 업데이트(수정)하기
	public void updateMemo();
	
	
	
	

}
