package Trees;

import java.util.ArrayList;
import java.util.List;

public class Problem76{

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     List<Integer> preorder(TreeNode head, List<Integer> list){
       if(head== null){
         return list;
       }
       list.add(head.val);
       preorder(head.left,list);
       preorder(head.right,list);
       return list;

    }
    public List<Integer> preorderTraversal(TreeNode root) {
          List<Integer> list = new ArrayList<>();
        return preorder(root,list);
    }
}


}