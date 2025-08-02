package com.lilac.service;

import com.lilac.pojo.entity.Department;

import java.util.List;

public interface DepartmentService {
    /**
     * 查询所有部门
     * @return
     */
    List<Department> selectAll();
}
