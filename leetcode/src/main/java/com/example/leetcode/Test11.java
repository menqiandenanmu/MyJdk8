package com.example.leetcode;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/03/30 12:28
 * @version: V1.0
 */
public class Test11 {
    public static void main(String[] args) {
        Solution11 solution11=new Solution11();
        int[] height={1,2,3,4,5,6,7,8};
        int[] height2={7,1,6,2,5,4,8,8,3};
       System.out.println(solution11.maxArea(height));;
        System.out.println(solution11.maxArea(height2));;
    }
}
