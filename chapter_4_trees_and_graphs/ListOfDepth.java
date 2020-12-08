/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Farzana
 */

  //4.3 
    
  /*   if you have depth with D then you will have D linked lists
    /*
     1
    /  \
   2     3
 /   \
4   5
    
input node=1
output :  linked list [[TreeNode{val=1}], [TreeNode{val=2}, TreeNode{val=3}], [TreeNode{val=4}, TreeNode{val=5}]]

input node=2
output : linked list [[TreeNode{val=2}], [TreeNode{val=4}, TreeNode{val=5}]]
*/

public class ListOfDepth {
  
    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode node){
        
       ArrayList<LinkedList<TreeNode>> result=new ArrayList<>();
       LinkedList<TreeNode> current=new LinkedList<TreeNode>();
       if(node!=null)
           current.add(node);
       
       while(current.size()>0){
           result.add(current);
           LinkedList<TreeNode> parent=current;
           current=new LinkedList<TreeNode>();
           for(TreeNode temp:parent){
               if(temp.left!=null) current.add(temp.left);
               if(temp.right!=null) current.add(temp.right);
           }
           
       }
       
       return result;
            
    
    }
    
    
    
    public static void main(String args[]){
    TreeNode node=new TreeNode(1);
            node.left=new TreeNode(2);
            node.right=new TreeNode(3);
            node.left.left=new TreeNode(4);
            node.left.right=new TreeNode(5);
        
            System.out.println(" Level  by level traversal linked list "+ListOfDepth.createLevelLinkedList(node.left).toString());
    }
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }

        @Override
        public String toString() {
            return "TreeNode{" + "val=" + val + '}';
        }
        
    }
}
