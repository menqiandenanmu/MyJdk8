package com.example.otherLearn;

import lombok.Builder;
import lombok.Data;

/**
 * @version V1
 * @类名: Person
 * @描述:
 * @author: 楠木
 * @日期:2020/11/12 14:09
 */
@Builder(toBuilder=true)
@Data
public class Person {
    public  String name;
    public String sex;
    public Integer age;
}
