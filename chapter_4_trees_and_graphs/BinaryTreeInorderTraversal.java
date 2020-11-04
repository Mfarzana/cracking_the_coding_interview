/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;

import java.util.Stack;

/**
 *
 * @author Farzana
 */
/*
     1
    /  \
   2     3
 /   \
4   5
Inorder (Left, Root, Right) : 4 2 5 1 3
*/

public class BinaryTreeInorderTraversal {
       
   // Recursion
    // solution 1
     public static void inorderTraversal(TreeNode node){
         if(node==null) return ;
         inorderTraversal(node.left);
         System.out.print("  "+node.val+"  ");
         inorderTraversal(node.right);
         
     }
   //  solution 2
      public static void solution2(TreeNode node){
            if(node!=null) {
               inorderTraversal(node.left);
               System.out.print("  "+node.val+"  ");
               inorderTraversal(node.right);

           }
      }
        //  solution 3 without recursion
      public static void solution3(TreeNode node){
            Stack<TreeNode> stack=new Stack();
            TreeNode curr=node;
            stack.push(curr);
            while(!stack.isEmpty()){
                    if(curr.left!=null){
           //                           stack.push(curr.left);l
        //                              curr=curr.left;
                    }else{
                        
                        System.out.print("s3  "+stack.pop());
                        curr=curr.right;
                    }
            }
            
      }
     
        
        public static void main(String args[]){
            
            TreeNode node=new TreeNode(1);
            node.left=new TreeNode(2);
            node.right=new TreeNode(3);
            node.left.left=new TreeNode(4);
            node.left.right=new TreeNode(5);
            
            BinaryTreeInorderTraversal.inorderTraversal(node);
             System.out.println();
            BinaryTreeInorderTraversal.solution2(node);
            
               System.out.println();
            BinaryTreeInorderTraversal.solution3(node);
            
        }
        
        static class TreeNode{
                int val;
                TreeNode left;
                TreeNode right;

                public TreeNode(int val){
                    this.val=val;
                    this.left=null;
                    this.right=null;
                }
    }


}

  