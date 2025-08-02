package com.lilac.controller;

import com.github.pagehelper.PageInfo;
import com.lilac.commen.Result;
import com.lilac.pojo.dto.EmployeeDTO;
import com.lilac.pojo.entity.Employee;
import com.lilac.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有员工
     * @return
     */
    @GetMapping("/selectAll")
    public Result selectAll() {
        log.info("查询所有员工");
        List<Employee> employees = employeeService.selectAll();
        return Result.success(employees);
    }

    /**
     * 分页查询员工
     * @param employeeDTO
     * @return
     */
    @GetMapping("/selectPage")
    public Result selectPage(EmployeeDTO employeeDTO) {
        log.info("分页查询员工{}", employeeDTO);
        PageInfo<Employee> pageInfo = employeeService.selectPage(employeeDTO);
        return Result.success(pageInfo);
    }

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    @GetMapping("/selectById/{id}")
    public Result selectById(Integer id) {
        log.info("查询员工id为{}", id);
        Employee employee = employeeService.selectById(id);
        return Result.success(employee);
    }

    /**
     * 添加员工
     * @param employee
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody Employee employee) {
        log.info("添加员工{}", employee);
        employeeService.add(employee);
        return Result.success();
    }

    /**
     * 更新员工
     * @param employee
     * @return
     */
    @PostMapping("/update")
    public Result update(@RequestBody Employee employee) {
        log.info("更新员工{}", employee);
        employeeService.update(employee);
        return Result.success();
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(Integer id) {
        log.info("删除员工id为{}", id);
        employeeService.deleteById(id);
        return Result.success();
    }
}
