package com.example.pojo;

import lombok.Builder;

/**
 * @version V1
 * @类名: Student
 * @描述:
 * @author: 楠木
 * @日期:2020/10/29 10:42
 */
@Builder(toBuilder = true)
public class Student {
    private String name;
    private Integer age;
    private String sex;
}
