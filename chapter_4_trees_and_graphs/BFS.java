/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
BFS result : 0 1 2 3 4
*/
public class BFS {
    public static void bfsUsingQueue(Node node){
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        node.visited=true;
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(" "+curr.data);
            for(Node n: curr.getNeighbours()){
                if(n!=null && ! n.visited){
                        q.add(n);
                        n.visited=true;
                }
            }
        }
}
    
    public static void main(String args[]){
           BFS.Node node0 =new BFS.Node(0);
            BFS.Node node1 =new BFS.Node(1);            
            BFS.Node node2 =new BFS.Node(2);           
            BFS.Node node3 =new BFS.Node(3);            
            BFS.Node node4 =new BFS.Node(4);          
            
            node0.addNeighbour(node1);
            node0.addNeighbour(node2);
            node0.addNeighbour(node3);
            node1.addNeighbour(node2);
            node2.addNeighbour(node4);		
        
            BFS.bfsUsingQueue(node0);
            
    
    }
    public static class Node{
        int data;
        List<Node> neighbours;
        boolean visited;

        public Node(int data) {
            this.data = data;
            this.neighbours=new ArrayList<>();
        }
        public void addNeighbour(Node node){
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
