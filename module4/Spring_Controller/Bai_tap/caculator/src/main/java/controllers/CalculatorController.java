package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }
    @PostMapping("/index")
    public String result(@RequestParam("num1") int num1,@RequestParam("num2") int num2,@RequestParam("math") String math, Model model) {
        int result;
        switch (math) {
            case "+" : {
                result = num1 + num2;
                break;
            }
            case "-" : {
                result = num1 - num2;
                break;
            }
            case "x" : {
                result = num1 * num2;
                break;
            }
            case "/" : {
                result = num1 / num2;
                break;
            }

            default:
                throw new IllegalStateException("Unexpected value: " + math);
        }
        model.addAttribute("result", result);
        return "index";
    }

}
