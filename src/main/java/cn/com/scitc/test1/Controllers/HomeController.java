package cn.com.scitc.test1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(value = "/")
    public String page1(){
        return "home";
    }
}
