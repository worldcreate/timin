package com.timin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by naoya on 2017/10/29.
 */
@Controller("/")
public class IndexController {

    @RequestMapping("/")
    public String index(ModelAndView modelAndView) {
        return "index";
    }

}
