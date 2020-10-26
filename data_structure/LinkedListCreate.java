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
public class LinkedListCreate {
    
    public static void main(String args[]){
        Node node=new Node(10); 
        node.appendToTail(12);  
        node.appendToTail(20);  
        node.appendToTail(21); 
        node.appendToTail(22); 
        node.appendToTail(23);
    }
}
class Node{ // end Node
        int data;
        Node next=null;
        
        public Node(int d){
            data=d;
        }
        void appendToTail(int d){
            Node end=new Node(d);
            Node n=this;
           System.out.println("  add "+d+"  ");
            while(n.next!=null){
                System.out.print(" "+n.data+" > ");
                n=n.next;
            }
            n.next=end;
        }
        
       
    }// end Node