package top.ijiaren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class IndexController {
    @RequestMapping("index")
    public String Index() {
        return "index";
    }
}
