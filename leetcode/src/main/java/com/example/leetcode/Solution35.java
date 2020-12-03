package com.example.leetcode;

/**
 * 原理：这是一个测试类<br>
 * 业务流程：仅示范java doc的使用
 *
 * @author first
 * @author second
 * @version 1.1
 */
public class Solution35 {


    public int searchInsert(int[] nums, int target) {

        int left=0;
        int right=nums.length;

        while(left<right){
            int mid=left+((right-left)>>>1);
            if(nums[mid]<target){
                left=++mid;

            }else{
                right=mid;
            }

        }
        return left;



    }

    public static void main(String[] args) {

        Solution35 solution35 = new Solution35();
        int a[]=new int[]{1,3,5,6};
        int target1=5;
        int target2=2;
        int target3=7;
        int target4=0;

        System.out.println(solution35.searchInsert(a,target1)); ;
        System.out.println(solution35.searchInsert(a,target2)); ;
        System.out.println(solution35.searchInsert(a,target3)); ;
        System.out.println(solution35.searchInsert(a,target4)); ;

    }

}
