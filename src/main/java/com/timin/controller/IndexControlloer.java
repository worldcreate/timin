package com.timin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.timin.service.SampleService;

/**
 * Created by naoya on 2017/10/29.
 */
@Controller("/")
public class IndexControlloer {

    @Autowired
    SampleService sampleService;

    @RequestMapping("/")
    public String index(ModelAndView modelAndView) {
        System.out.println(sampleService.findAll());

        return "index";
    }

}
