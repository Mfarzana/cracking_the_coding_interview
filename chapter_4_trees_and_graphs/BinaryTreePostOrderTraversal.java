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

      1
    /  \
   2     3
 /   \
4   5

Postorder (Left, Right, Root) : 4 5 2 3 1


*/
public class BinaryTreePostOrderTraversal {
    
    public static void postOrder(TreeNode node){
        if(node==null)
            return ;
        
            postOrder(node.left) ;
            postOrder(node.right) ;
            System.out.print(" "+node.val);
    }
     public static void main(String args[]){

                        TreeNode node=new TreeNode(1);
                        node.left=new TreeNode(2);
                        node.right=new TreeNode(3);
                        node.left.left=new TreeNode(4);
                        node.left.right=new TreeNode(5);

                        BinaryTreePostOrderTraversal.postOrder(node);
                         System.out.println();
                      
            }
static class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}

}