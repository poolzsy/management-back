package com.lilac.mapper;

import com.lilac.pojo.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    /**
     * 查询所有部门
     * @return
     */
    @Select("select * from department")
    List<Department> selectAll();
}
