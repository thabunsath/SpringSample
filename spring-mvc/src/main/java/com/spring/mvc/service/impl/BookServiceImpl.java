package com.spring.mvc.service.impl;

import org.springframework.stereotype.Service;

import com.spring.mvc.service.BookService;
@Service
public class BookServiceImpl implements BookService{

	@Override
	public String name() {
		return "Java learning!..";
	}

}
