package com.starQeem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.starQeem.pojo.employee;

import java.util.List;

public interface employeeService extends IService<employee> {
    PageInfo<employee> pageEmployeeByNameList(Integer pageNum, Integer pageSize,String search);
}
