package com.lilac.service.Impl;

import com.lilac.mapper.DepartmentMapper;
import com.lilac.pojo.entity.Department;
import com.lilac.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 查询所有部门
     * @return
     */
    @Override
    public List<Department> selectAll() {
        return departmentMapper.selectAll();
    }
}
