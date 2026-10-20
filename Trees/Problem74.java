package Trees;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

// Binary Tree Inorder Traversal
public class Problem74 {
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
    List<Integer> inorder(TreeNode head, List<Integer> list){
       if(head== null){
         return list;
       }
       inorder(head.left,list);
       list.add(head.val);
       inorder(head.right,list);
       return list;

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inorder(root,list);
    }
}
}
