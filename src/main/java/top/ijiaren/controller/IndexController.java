package top.ijiaren.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class IndexController {
    @RequestMapping
    public String Index() {
        return "index";
    }
}
