/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Farzana
 */
/*

Given a directed graph, design an algorithm to find out whether there is a route between two nodes.

Example

Given graph:

 A----->B----->C
  \               |
   \              |
    \             |
      \            v
         \ ->D----->E
for s = B and t = E, return true

for s = D and t = C, return false
*/
public class RouteBetweenTwoNodesGraph {
    
       public static boolean hasRouteUsingBFS(List<DirectdGraphNode> nodelist, DirectdGraphNode src, DirectdGraphNode dest){
       
           Queue<DirectdGraphNode> queue=new LinkedList<>();
           Set<DirectdGraphNode> visited=new HashSet<>();
           queue.add(src);
           while(!queue.isEmpty()){
               DirectdGraphNode curr=queue.poll();
               
               if(curr==dest)
                   return true;
               
               for(DirectdGraphNode node: curr.getNeighbours()){
                   if(! visited.contains(node)){
                       queue.add(node);
                   }
               }
           }
       
           
           return false;
       }
    
    
    
    
    
    public static void main(String args[]){
        
            DirectdGraphNode node0 =new DirectdGraphNode(0);
            DirectdGraphNode node1 =new DirectdGraphNode(1);            
            DirectdGraphNode node2 =new DirectdGraphNode(2);           
            DirectdGraphNode node3 =new DirectdGraphNode(3);            
            DirectdGraphNode node4 =new DirectdGraphNode(4);          
            
            node0.addNeighbour(node1); // A->B
            node0.addNeighbour(node3); // A-<D
            node1.addNeighbour(node3); //B->D
            node1.addNeighbour(node2); // B->C
            node3.addNeighbour(node4);  // D->E	
           // end graph input
            
            
            
            
         ArrayList<DirectdGraphNode> nodeList=new ArrayList<>();
         nodeList.add(node0);
         nodeList.add(node1);        
         nodeList.add(node2);       
         nodeList.add(node3);       
         nodeList.add(node4);
    
        boolean   result= RouteBetweenTwoNodesGraph.hasRouteUsingBFS(nodeList, node1, node3);
        System.out.println( " Path between B and E is "+result);
          
    }
    public static class DirectdGraphNode{
        int lebel;
        List<DirectdGraphNode> neighbours;
   //     boolean visited;

        public DirectdGraphNode(int lebel) {
            this.lebel = lebel;
            this.neighbours=new ArrayList<>();
        }

        public List<DirectdGraphNode> getNeighbours() {
            return neighbours;
        }

        public void setNeighbours(List<DirectdGraphNode> neighbours) {
            this.neighbours = neighbours;
        }
        public  void addNeighbour(DirectdGraphNode node){
            this.neighbours.add(node);
        }
        
        

}
}
