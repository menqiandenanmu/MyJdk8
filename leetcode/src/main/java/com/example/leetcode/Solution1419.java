package com.example.leetcode;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/04/24 10:02
 * @version: V1.0
 */
public class Solution1419 {
    public int minNumberOfFrogs(String croakOfFrogs) {
        char [] croakOfFrog=croakOfFrogs.toCharArray();
        int croak=0;
        int c = 0;
        int r=0;
        int o=0;
        int a =0 ;
        int k=0;
        for(int i=0;i<croakOfFrog.length;i++){
            if(croakOfFrog[i]=='c'){
                    c++;
                    if(k>0){
                        k--;
                    }else{
                        croak++;
                    }

            }else if(croakOfFrog[i]=='r'){
                r++;
                c--;
            }
            else if(croakOfFrog[i]=='o'){
                o++;
                r--;
            }
            else if(croakOfFrog[i]=='a'){
                a++;
                o--;
            }
            else if(croakOfFrog[i]=='k'){
                k++;
                a--;
            }
            if(c <0 || r <0 || o <0 || a <0){
                break;
            }
        }
        if(c != 0 || r != 0 || o != 0 || a != 0||k!=0){
            return -1;
        }
        return croak;

    }
}
