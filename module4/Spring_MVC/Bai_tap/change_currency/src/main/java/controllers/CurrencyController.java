package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyController {
    @GetMapping("/change")
    public ModelAndView change(@RequestParam("money") Integer money) {
        int result = money * 23000;
        return new ModelAndView("result", "result", result);
    }

}
