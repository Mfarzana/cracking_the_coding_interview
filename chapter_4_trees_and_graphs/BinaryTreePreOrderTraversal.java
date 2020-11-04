/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;

/**
 *
 * @author Farzana
 */
/*

/*
     1
    /  \
   2     3
 /   \
4   5
Preorder (Root, Left, Right) : 1 2 4 5 3

*/
 
public class BinaryTreePreOrderTraversal {
    
   
    
            public static void preorderTraversa (TreeNode node){
                    if(node ==null)
                        return ;
                    System.out.print(" "+node.val);
                    preorderTraversa(node.left);
                     preorderTraversa(node.right);
                            
                            
            
            }

            public static void main(String args[]){

                        TreeNode node=new TreeNode(1);
                        node.left=new TreeNode(2);
                        node.right=new TreeNode(3);
                        node.left.left=new TreeNode(4);
                        node.left.right=new TreeNode(5);

                        BinaryTreePreOrderTraversal.preorderTraversa(node);
                         System.out.println();
                      
            }
            
     static   class TreeNode{
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

          