package com.callor.books.data.service;

import java.util.List;

import com.callor.books.data.models.PublisherDto;

public interface PublisherService {
	
	public void loadPubliser();
	public void printPubliser();
	
	public PublisherDto getPubliser(String code);
	public List<PublisherDto> getPubliserList();
	public List<PublisherDto> getPubliserListByName(String name);

}
