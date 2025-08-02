package com.lilac.controller;

import com.lilac.commen.Result;
import com.lilac.pojo.entity.Department;
import com.lilac.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    /**
     * 查询所有部门
     *
     * @return
     */
    @RequestMapping("/selectAll")
    public Result selectAll() {
        log.info("查询所有部门");
        List<Department> departments = departmentService.selectAll();
        return Result.success(departments);
    }
}
