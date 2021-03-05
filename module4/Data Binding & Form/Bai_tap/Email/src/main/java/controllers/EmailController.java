package controllers;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
//    @GetMapping("/")
//    public ModelAndView setting() {
//        return new ModelAndView("index", "email", new Email());
//    }
    @GetMapping("/")
    public String getForm(Model model) {
        List<String> language = new ArrayList<>();
        language.add("English");
        language.add("Vietnamese");
        language.add("Japanese");
        language.add("Chinese");
        List<Integer> size = new ArrayList<>();
        size.add(5);
        size.add(10);
        size.add(15);
        size.add(20);
        size.add(25);
        size.add(50);
        size.add(100);
        model.addAttribute("language", language);
        model.addAttribute("size", size);
        model.addAttribute("email",new Email());
        return "index";
    }
}
