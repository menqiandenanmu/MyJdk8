package com.example.leetcode;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/05/20 11:22
 * @version: V1.0
 */
public class Solution102 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;
        else if (p==null||q==null)return false;
        else return (p.val==q.val)&&(isSameTree(p.left,q.left))&&(isSameTree(p.right,q.right));

    }
}
