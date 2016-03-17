package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.service.BookService;
@Controller
public class BookController {
	
@Autowired
BookService bookService;	
 
@RequestMapping("/book")

 public void getBookView(Model model, HttpServletRequest request){	 
	 String name = bookService.name(); 
	 System.out.println("name="+ request.getParameter("txtName"));
	 model.addAttribute("bookName", name);
}
}