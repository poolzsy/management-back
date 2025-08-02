package com.lilac.service;

import com.github.pagehelper.PageInfo;
import com.lilac.pojo.dto.EmployeeDTO;
import com.lilac.pojo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * 查询所有员工
     * @return
     */
    List<Employee> selectAll();

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    Employee selectById(Integer id);

    /**
     * 添加员工
     * @param employee
     */
    void add(Employee employee);

    /**
     * 修改员工
     * @param employee
     */
    void update(Employee employee);

    /**
     * 根据id删除员工
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 分页查询员工
     * @param employeeDTO
     * @return
     */
    PageInfo<Employee> selectPage(EmployeeDTO employeeDTO);
}
