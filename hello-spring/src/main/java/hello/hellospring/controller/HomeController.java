package hello.hellospring.controller;


import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@PathVariable @Nullable String name, Model model){
        if(name != null) model.addAttribute(name);
        System.out.println(name);
        return "home";
    }
}
