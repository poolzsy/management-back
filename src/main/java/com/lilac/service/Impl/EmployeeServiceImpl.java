package com.lilac.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lilac.mapper.DepartmentMapper;
import com.lilac.pojo.dto.EmployeeDTO;
import com.lilac.pojo.entity.Employee;
import com.lilac.mapper.EmployeeMapper;
import com.lilac.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 查询所有员工
     * @return
     */
    @Override
    public List<Employee> selectAll() {
        return employeeMapper.selectAll();
    }

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    @Override
    public Employee selectById(Integer id) {
        return employeeMapper.selectById(id);
    }

    /**
     * 添加员工
     * @param employee
     */
    @Override
    public void add(Employee employee) {
        employeeMapper.add(employee);
    }

    /**
     * 修改员工
     * @param employee
     */
    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }

    /**
     * 根据id删除员工
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        employeeMapper.deleteById(id);
    }

    /**
     * 分页查询员工
     * @param employeeDTO
     * @return
     */
    @Override
    public PageInfo<Employee> selectPage(EmployeeDTO employeeDTO) {
        PageHelper.startPage(employeeDTO.getPageNum(), employeeDTO.getPageSize());
        List<Employee> employees = employeeMapper.selectPage(employeeDTO);
        return new PageInfo<>(employees);
    }
}
