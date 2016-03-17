package com.spring.mvc.service.impl;
import org.springframework.stereotype.Service;

import com.spring.mvc.service.TextService;

@Service
public class TextServiceImpl implements TextService {

	@Override
	public String generateText() {
		return "Dara";
	}

}
