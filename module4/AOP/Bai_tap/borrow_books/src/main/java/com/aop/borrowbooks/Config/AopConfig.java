package com.aop.borrowbooks.Config;

import com.aop.borrowbooks.model.Book;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AopConfig {
    @Bean
    public Book book() {
        return new Book();
    }
}
