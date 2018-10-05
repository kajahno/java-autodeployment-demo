package com.example.javaautodeploymentdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           @RequestParam(name="other_param", required=false, defaultValue="My other param") String other_param, Model model) {
        model.addAttribute("name", name);


        model.addAttribute("other_param", other_param);
        return "greeting";
    }

}
