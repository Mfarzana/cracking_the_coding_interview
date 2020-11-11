/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Farzana
 */
/*

0,--> 1
0,-->2
0--->3
1, -->2
2--->4 



                   3
                /
            /  
        0 
        |      \
        |           \
        |           2------4
        |       /
        |   /
        1
DFS: 0,1,2,4,3 or 0 3 2 4 1 or 0,2,4,1  or else ok . its not direct graph

*/
public class DFS {
    public static void dfsUsingStack(Node node){
        Stack<Node> stack=new Stack<>();
        stack.add(node);
        while(!stack.isEmpty()){
                Node temp=stack.pop();
                if(!temp.visited){
                     System.out.print(" "+temp.data);
                     temp.visited=true;
                }
               
                for(Node n:temp.getNeighbours()){
                    stack.add(n);
                }
        }
    
    }
    
    public static void main(String args[]){
        
            Node node0 =new Node(0);
            Node node1 =new Node(1);            
            Node node2 =new Node(2);           
            Node node3 =new Node(3);            
            Node node4 =new Node(4);          
            
            node0.addNeighbours(node1);
            node0.addNeighbours(node2);
            node0.addNeighbours(node3);
            node1.addNeighbours(node2);
            node2.addNeighbours(node4);		
        
            DFS.dfsUsingStack(node0);
            
       
    }
    
    
    public static class Node{
                int data;
                boolean visited;
                List<Node> neighbours;

        public Node(int data) {
            this.data = data;
            this.neighbours=new ArrayList<>();
        }

        public void addNeighbours(Node node){
            this.neighbours.add(node);
        }
        public List<Node> getNeighbours() {
            return neighbours;
        }

        public void setNeighbours(List<Node> neighbours) {
            this.neighbours = neighbours;
        }

       
                
        
    }
}
