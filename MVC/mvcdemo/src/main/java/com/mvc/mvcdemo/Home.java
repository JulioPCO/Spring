package com.mvc.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @RequestMapping("index")
    public String index(){
        System.out.println("hi");
        return "index.jsp";
    }
}
