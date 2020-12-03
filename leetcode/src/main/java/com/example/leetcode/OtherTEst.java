package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/05/19 16:06
 * @version: V1.0
 */
public class OtherTEst {
    public static void main(String[] args) {
        DemoEnum a=   DemoEnum.INSTANCE.getInstance();
        DemoEnum b=   DemoEnum.INSTANCE.getInstance();
        System.out.println(b.getAge());
        a.setAge(222);
        System.out.println(b.getAge());

        System.out.println(2+((3-2)>>>1));
    }
}
