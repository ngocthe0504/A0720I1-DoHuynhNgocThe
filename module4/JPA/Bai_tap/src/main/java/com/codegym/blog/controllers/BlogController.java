package com.codegym.blog.controllers;

import com.codegym.blog.models.Blog;
import com.codegym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("/")
    public ModelAndView getList() {
        return new ModelAndView("index", "blog", blogService.findAll());
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        blogService.delete(blogService.findById(id));
        return "redirect:/";
    }
    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("create", "blog", new Blog());
    }
    @PostMapping("/create")
    public String saveBlog(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/";
    }
    @GetMapping("/{id}/view")
    public ModelAndView view(@PathVariable int id) {
        return new ModelAndView("view", "blog", blogService.findById(id));
    }
    @PostMapping("/view")
    public String update(@ModelAttribute Blog blog) {
            blogService.save(blog);
        return "redirect:/";
    }
}
