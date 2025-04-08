/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemsolving.LinkedLisPro;


public class Node {
    
    private Node next ;
    private int value ;
    
    public Node(int value){
        this.value = value ;
    }
    
//    Getter
    
    public Node getNext(){
        return next ;
    }
    
    public int getValue(){
        return value ;
    }
    
//    Setter 
    public void setValue(int value){
        this.value = value ;
    }
    
    public void setNode(Node next){
        this.next = next ;
        
    }
}
