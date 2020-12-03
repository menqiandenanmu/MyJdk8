package com.example.leetcode;

import java.util.HashMap;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/05/13 10:41
 * @version: V1.0
 */
public class Solution13 {
    public int romanToInt(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",9);
        map.put("IX",1000);
        map.put("V",1000);
        map.put("IV",1000);
        map.put("I",1000);
      // {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    //    {"M" ,"CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            return 11;
    }
}
