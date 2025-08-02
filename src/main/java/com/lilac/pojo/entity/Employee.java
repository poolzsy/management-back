package com.lilac.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工信息表(Employee)表实体类
 *
 * @author makejava
 * @since 2025-08-02 11:16:03
 */
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    //ID
    private Integer id;
    //名称
    private String name;
    //性别
    private String sex;
    //工号
    private String workNumber;
    //年龄
    private Integer age;
    //个人介绍
    private String description;
    //部门ID
    private Integer departmentId;

    private String departmentName;

}

