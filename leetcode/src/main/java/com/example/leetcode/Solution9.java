package com.example.leetcode;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/03/30 17:39
 * @version: V1.0
 */
public class Solution9 {
    public Boolean isReverse(int x)
    {
        String  s=(new StringBuffer(x+"")).reverse().toString();
        return  s.equals(x+"");
    }
}
