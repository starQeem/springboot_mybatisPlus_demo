package com.starQeem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.starQeem.mapper.employeeMapper;
import com.starQeem.pojo.employee;
import com.starQeem.service.employeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class employeeServiceImpl extends ServiceImpl<employeeMapper, employee> implements employeeService {
    @Resource
    private employeeMapper employeeMapper;
    @Override
    public PageInfo<employee> pageEmployeeByNameList(Integer pageNum, Integer pageSize,String search) {
        PageHelper.startPage(pageNum,pageSize);
        QueryWrapper<employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("nick_name",search);
        List<employee> employeeList = employeeMapper.selectList(queryWrapper);
        return new PageInfo<>(employeeList,pageSize);
    }
}
