package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 *
 */
// Postorder Traversal

public class Problem75 {
     public class TreeNode {
   int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  class Solution {
    List<Integer> postorder(TreeNode head, List<Integer> list){
       if(head== null){
         return list;
       }
       postorder(head.left,list);
       postorder(head.right,list);
       list.add(head.val);
      
       return list;

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return postorder(root,list);
    }
}

}
