package com.lilac.mapper;

import com.lilac.pojo.dto.EmployeeDTO;
import com.lilac.pojo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    /**
     * 查询所有员工
     * @return
     */
    @Select("select * from employee")
    List<Employee> selectAll();

    /**
     * 分页查询员工
     * @param employeeDTO
     * @return
     */
    List<Employee> selectPage(EmployeeDTO employeeDTO);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    @Select("select * from employee where id = #{id}")
    Employee selectById(Integer id);

    /**
     * 添加员工
     * @param employee
     */
    @Select("insert into employee values(#{id},#{name},#{sex},#{workNumber},#{age},#{description},#{departmentId})")
    void add(Employee employee);

    /**
     * 修改员工
     * @param employee
     */
    @Update("update employee set name = #{name},sex = #{sex},work_number = #{workNumber}," +
            "age = #{age},description = #{description},department_id = #{departmentId} where id = #{id}")
    void update(Employee employee);

    /**
     * 根据id删除员工
     * @param id
     */
    @Update("delete from employee where id = #{id}")
    void deleteById(Integer id);
}
