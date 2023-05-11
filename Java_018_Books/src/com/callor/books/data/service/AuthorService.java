
package com.callor.books.data.service;

import java.util.List;

import com.callor.books.data.models.AuthorDto;


public interface AuthorService {
	
	public void loadAuthor();
	public void printAuthorList();
	
	public AuthorDto getAuthor(String code);
	
	public List<AuthorDto> getAuthorList();
	
	
	
	

}
