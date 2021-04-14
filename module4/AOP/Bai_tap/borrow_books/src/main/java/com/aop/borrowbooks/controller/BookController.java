package com.aop.borrowbooks.controller;

import com.aop.borrowbooks.service.Impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    BookServiceImpl bookServiceImpl;
    @GetMapping("/")
    public ModelAndView getHomePage() {
        return new ModelAndView("list", "books", bookServiceImpl.findAll());
    }
}
