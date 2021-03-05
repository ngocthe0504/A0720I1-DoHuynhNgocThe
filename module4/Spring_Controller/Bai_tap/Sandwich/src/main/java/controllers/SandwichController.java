package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SandwichController {
    @GetMapping("/")
    public ModelAndView getHomePage() {
        return new ModelAndView("index");
    }

    @PostMapping("/result")
    public String result(@RequestParam(value = "condiment", required = false) String[] condiment, Model model, RedirectAttributes redirectAttributes) {
        StringBuilder stringBuilder = new StringBuilder(1000);
        if (condiment == null) {
            stringBuilder.append("no gia vị được chọn!!!!");
        } else {
            for (int i = 0; i < condiment.length; i++) {
                stringBuilder.append(condiment[i]).append("\n");
            }
        }
        redirectAttributes.addFlashAttribute("result", stringBuilder);
        return "redirect:/";
    }
}
