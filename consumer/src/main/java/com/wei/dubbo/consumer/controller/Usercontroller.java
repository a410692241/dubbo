package com.wei.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wei.dubbo.service.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @Reference
    private EmployeeService employeeService;

    @RequestMapping("hello")
    public Object hello() {
        return employeeService.selectByPrimaryKey(65);
    }

}
