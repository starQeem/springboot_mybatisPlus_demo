package com.starQeem.controller;

import com.github.pagehelper.PageInfo;
import com.starQeem.common.Result;
import com.starQeem.pojo.employee;
import com.starQeem.service.employeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:8080")
public class employeeController {
    @Resource
    private employeeService employeeService;
    /*
     * 查询
     * */
    @GetMapping
    public Result<?> query(@RequestParam(defaultValue = "1") Integer pageNum,
                           @RequestParam(defaultValue = "10") Integer pageSize,
                           @RequestParam(defaultValue = "") String search) {
        PageInfo<employee> pageInfo = employeeService.pageEmployeeByNameList(pageNum, pageSize, search);
        return Result.success(pageInfo);
    }
    /*
     * 新增
     * */
    @PostMapping
    public Result<?> save(@RequestBody employee employee) {
        employeeService.save(employee);
        return Result.success();
    }
    /*
     * 修改
     * */
    @PutMapping
    public Result<?> updateById(@RequestBody employee employee) {
        employeeService.updateById(employee);
        return Result.success();
    }
    /*
     * 删除
     * */
    @DeleteMapping("/{id}")
    public Result<?> deleteById(@PathVariable Long id) {
        employeeService.removeById(id);
        return Result.success();
    }

}
