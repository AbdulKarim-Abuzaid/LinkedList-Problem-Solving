
package com.mycompany.problemsolving.LinkedLisPro;


public class LinkedList {
    
    private Node head ;
    
    public LinkedList(){
        
    }
    
    public LinkedList(Node head){
        this.head = head ;
    }
    
//    Methods of Linked List 
    
    public void add(Node item){
        
        if(head.equals(null)){
            head = item ;
        }
        
      Node tail =head ;
      while(tail.getNext() != null){
          tail.setNode(tail.getNext());
          
      }
    }
}
