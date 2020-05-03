package com.example.leetcode;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/04/07 14:40
 * @version: V1.0
 */
public class Solution12 {
    public String intToRoman(int num) {
        int num1[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M" ,"CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuffer result=new StringBuffer();
        for(int i=0;i<num1.length;i++){
            if(num/num1[i]>0){
                num=num-num1[i];

                result=result.append(roman[i]);
                i--;
            }

        }
        return result.toString();

    }

}
