package com.timin.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.timin.entity.AddTask;

/**
 * Created by naoya on 2017/10/29.
 */
@Controller("/")
public class IndexController {

    private static final Logger logger = LogManager.getLogger(IndexController.class);


    @RequestMapping("/")
    public String index(ModelAndView modelAndView) {

        return "index";
    }

}
