package com.codegym.blog.service;

import com.codegym.blog.models.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    void save(Blog blog);
    void delete(Blog blog);
    Blog findById(int id);
}
