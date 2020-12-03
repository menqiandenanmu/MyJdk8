package com.example.leetcode;


/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/05/20 11:04
 * @version: V1.0
 */
public class Solution101 {


            public boolean isSymmetric(TreeNode root) {

                return isMirror(root,root);
            }

        private boolean isMirror(TreeNode leftRoot, TreeNode rightRoot) {
                if(leftRoot==null&&rightRoot==null){return true;}
                else if(leftRoot==null||rightRoot==null){return false;}
                else{ return (leftRoot==rightRoot)&&(isMirror(leftRoot.left,rightRoot.right))&&(isMirror(leftRoot.right,
                        rightRoot.left));}
        }

}
