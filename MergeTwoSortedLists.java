/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemsolving.LinkedLisPro;

/*Problem Defeinetion:
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 
 
*/
public class MergeTwoSortedLists {
    
    public LinkedList mergeTwoSortedList(Node head1 , Node head2){
        
      LinkedList sum = new LinkedList(); 
      Node cur1 =head1 ;
      Node cur2 = head2 ;
      
      while(!cur1.getNext().equals(null) && !cur2.getNext().equals(null) ){
          
          if(cur1.getValue()< cur2.getValue()){
              sum.add(cur1);
              cur1= cur1.getNext();
          }
          if(cur2.getValue()< cur2.getValue()){
              sum.add(cur2);
              cur2= cur2.getNext();
          }
             
      }
      while(!cur1.getNext().equals(null)){
          sum.add(cur1);
          cur1 = cur1.getNext() ;
      }
      while(!cur2.getNext().equals(null)){
          sum.add(cur2);
          cur2 = cur2.getNext() ;
      }
      return sum ;
        
    } 
    
    
}
