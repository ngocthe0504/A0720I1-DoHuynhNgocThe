package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ProductService;

@Controller
@RequestMapping("")
public class ProductController {
    private ProductService productService = new ProductService();

    @GetMapping("")
    public ModelAndView index(Model model) {
        return new ModelAndView("index", "products", productService.findAll());
    }

//    @GetMapping("/product/create")
//    public String create(Model model) {
//        model.addAttribute("product", new Product());
//        return "create";
//    }
//
//    @PostMapping("/product/save")
//    public String save(Product product, RedirectAttributes redirect) {
//        product.setId((int)(Math.random() * 10000));
//        productService.create(product);
//        redirect.addFlashAttribute("success", "Saved product successfully!");
//        return "redirect:/";
//    }
//
//    @GetMapping("/product/{id}/edit")
//    public String edit(@PathVariable int id, Model model) {
//        model.addAttribute("product", productService.findById(id));
//        return "edit";
//    }
//
//    @PostMapping("/product/update")
//    public String update(Product product, RedirectAttributes redirect) {
//        productService.update(product.getId(), product);
//        redirect.addFlashAttribute("success", "Modified product successfully!");
//        return "redirect:/";
//    }
//
//    @GetMapping("/product/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("product", productService.findById(id));
//        return "delete";
//    }
//
//    @PostMapping("/product/delete")
//    public String delete(Product product, RedirectAttributes redirect) {
//        productService.delete(product.getId());
//        redirect.addFlashAttribute("success", "Removed product successfully!");
//        return "redirect:/";
//    }
//
//    @GetMapping("/product/{id}/view")
//    public String view(@PathVariable int id, Model model) {
//        model.addAttribute("product", productService.findById(id));
//        return "view";
//    }

}
