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
public class SingleLinkedList {
    
            public static void main(String args[]){
                    Node node=new Node(10); 
                    node.appendToTail(12);  
                    node.appendToTail(20);  
                    node.appendToTail(21); 
                    node.appendToTail(22); 
                    node.appendToTail(23);
                    System.out.println("  add  to linkdelist");
                    Node head=node;
                    node.print(node);   
                    Node newNode=node.deleteNode(head, 21);
                    System.out.println("\n  delete value from linkedlist  ");
                   node.print(node);   
                
        }
}

class Node{ // end Node
        int data;
        Node next=null;
                public  Node(int d){
            data=d;
        }
        
        // Creating a LinkedList
        void appendToTail(int d){
                        Node end=new Node(d);
                        Node n=this;                     
                        while(n.next!=null){                             
                                     n=n.next;
                        }
            n.next=end;
        }
        
        
        //Deleting a node form a single linkedlist
        Node deleteNode(Node head, int d ){
            Node n=head;
            if(head.data==d)
                    return head.next;
            while(n.next!=null){
                        if(n.next.data==d){
                            n.next=n.next.next;
                            return head;
                        }
                     n=n.next;       
            }
            return head;
        }
       
        
        // Print LinkedList
        void print(Node n){
            while(n!=null){
                        System.out.print(" > "+n.data);
                        n=n.next;
                    }
        }
        
    }// end Node