package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 原理：这是一个测试类<br>
 * 业务流程：仅示范java doc的使用
 *
 * @author first
 * @author second
 * @version 1.1
 */
public class Solution6 {
    public String convert(String s, int numRows) {

        if(numRows==1){
            return  s;
        }

        Boolean godown=false;
        List<StringBuilder> rows=new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            StringBuilder sb=new StringBuilder();
            rows.add(sb);

        }
        int currRow=0;
        for(int i=0;i<s.length();i++){
            rows.get(currRow).append(s.charAt(i));
            if(currRow==0||currRow==numRows-1){godown=!godown;}
                currRow+=godown?1:-1;

        }

        StringBuilder sb=new StringBuilder();
        for(int i = 0; i <numRows ; i++){
            sb.append(rows.get(i));
        }
        return sb.toString();
    }
}
