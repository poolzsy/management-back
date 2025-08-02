package com.lilac.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 部门表(Department)表实体类
 *
 * @author makejava
 * @since 2025-08-02 16:39:14
 */
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    //部门id
    private Integer id;
    //部门名称
    private String departmentName;

}

