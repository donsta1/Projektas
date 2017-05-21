package com.examsys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String index() {
        
        return "titulinis";
    }
    
    @RequestMapping("/testai")
    public String testai(Questions gizmo) {
        return "testai";
    }
    
    @RequestMapping("/rezultatai")
    public String rezultatai(Questions gizmo) {
        return "rezultatai";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
