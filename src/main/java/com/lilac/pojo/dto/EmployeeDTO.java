package com.lilac.pojo.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private String name;
    private Integer pageNum;
    private Integer pageSize;
}
