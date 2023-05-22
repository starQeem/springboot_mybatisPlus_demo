package com.starQeem;

import com.starQeem.service.employeeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootMybatisPlusDemoApplicationTests {
    @Resource
    private employeeService employeeService;
    @Test
    void tesQuery() {
        System.out.println(employeeService.list());
    }

}
