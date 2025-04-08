/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemsolving.LinkedLisPro;

import java.util.HashMap;


public class LinkedListCycle {
    
/* Problem: is LinkedList Cycle
    Defenitino:
    
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
    
Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 
    */ 
    
    public boolean hasCycle(Node head){
        
     Node top = head ;   
    HashMap<Node, String> visited = new HashMap<>();
        
    while(top.getNext()!=null){
    
     if(visited.containsKey(top)){
         return true ;
     }
     else{
         visited.put(top,String.valueOf(top.getValue())) ;
         top = top.getNext() ;
     }
        
    }
    return false ;
    }
    
}
