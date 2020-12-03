package com.example.leetcode;

import lombok.Data;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/05/20 11:05
 * @version: V1.0
 */
@Data
public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
     TreeNode(Integer[] arr){
         TreeNode root=new TreeNode(arr[0]);
         root=  getTree(null,arr,0,arr.length);
     }




    TreeNode getTree(TreeNode parentRoot,Integer[]  arr,int i, int n) {
         if(null==parentRoot){
             parentRoot = new TreeNode(arr[i]);
             parentRoot.left = getTree(parentRoot,arr, 2 * i + 1, n);
             parentRoot.right = getTree(parentRoot,arr, 2 * i + 2, n);
         }
        if (i > n || null == arr) {
            return parentRoot;
        }
        if (i < n) {
            TreeNode root = new TreeNode(arr[i]);
            root.left = getTree(root,arr, 2 * i + 1, n);
            root.right = getTree(root,arr, 2 * i + 2, n);

        }
        return parentRoot;
    }

}
