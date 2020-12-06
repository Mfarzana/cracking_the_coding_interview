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
public  class SortedArrayToMinimalTree {
   TreeNode screateMinimalBST(int[] array){
       return createMinimalBST(array, 0, array.length-1);
    }
   
   TreeNode createMinimalBST(int arr[], int start, int end){
       if(end<start)
           return null;
       int mid=(start+end)/2;
       TreeNode n=new TreeNode(arr[mid]);
       n.left=createMinimalBST(arr, start, mid-1);
       n.right=createMinimalBST(arr, mid+1, end);
       return n;       
   }
   public void printNode(TreeNode n){
       if(n==null) return;
       System.out.print(" "+n.val);
       printNode(n.left);
       printNode(n.right);      
   }
   
    public static void main(String args[]){
        SortedArrayToMinimalTree minimalTree=new SortedArrayToMinimalTree();
        int [] arr=new int[]{ 1,2,3,4,8,9,10 };        
        TreeNode n= minimalTree.screateMinimalBST(arr);
        minimalTree.printNode(n);
    }
   private class  TreeNode{
     int val;
     TreeNode left;
     TreeNode right;
     
     public TreeNode(int val){
         this.val=val;
         left=null;
         right=null;
     }
}
    
}
