package com.timin.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.timin.entity.Employee;
import com.timin.service.SampleService;

/**
 * Created by naoya on 2017/10/29.
 */
@Controller("/")
public class IndexControlloer {

    private static final Logger logger = LogManager.getLogger(IndexControlloer.class);
    
    @Autowired
    SampleService sampleService;

    @RequestMapping("/")
    public String index(ModelAndView modelAndView) {
        List<Employee> employees = sampleService.findAll();
        employees.forEach(entity -> {
            logger.info("id={}, name={}, age={}", entity.getId(), entity.getName(), entity.getAge());
        });

        return "index";
    }

}
