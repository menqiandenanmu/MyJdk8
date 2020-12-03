package com.example;

/**
 * 原理：这是一个测试类<br>
 * 业务流程：仅示范java doc的使用
 *
 * @author first
 * @author second
 * @version 1.1
 */
public class 最长公共子序列LCS {
    public static void main(String[] args) {
        String str1="helloworld";

        String str2="lowop";


        int[][] arr=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++) {
            for (int j = 0; j < str2.length(); j++) {
                arr[i][j]=0;
            }
        }


        for(int i=1;i<=str1.length();i++){
            for (int j = 1; j <= str2.length(); j++) {

                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=0;
                }

            }
        }

        int max=0;
        for(int i=0;i<=str1.length();i++){
            for (int j = 0; j < str2.length(); j++) {

               if(arr[i][j]>max){
                   max=arr[i][j];
               }

            }
        }
        System.out.println("最长公共子序列LCS.main:"+max);
    }





}
