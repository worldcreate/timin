package com.timin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timin.dao.SampleRepository;
import com.timin.entity.Employee;

@Service
public class SampleService {
    @Autowired
    SampleRepository sampleRepository;
    
    @Transactional
    public List<Employee> findAll() {
        return sampleRepository.selectAll();
    }
}
