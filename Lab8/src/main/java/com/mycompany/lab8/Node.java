/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Ranveer Singh PC
 */
class Node {
    public int data;
    public Node next;
    
    public Node (int data){
        this.data =data;
        this.next=null;
    }
}
class LinkedList {
    private Node tail;
    private Node head;
  public LinkedList(){
      tail =null;
      head=null;
  }
  
  public void append(Node newNode) {
if(head ==null){    
}
else{
tail.next=newNode;
tail=newNode;
}
}
 public void prepend(Node newNode){
if(head ==null){
head=newNode;
tail=newNode;
}
else{
newNode.next=head;
head=newNode;
}
}
public void removeAfter(Node currentNode){
if(currentNode == null && head !=null){
Node succedingNode=head.next;
head=succedingNode;
  tail =null;
}
}
public String tostring(){
String str = "";
Node e = this. head;
while(e!=null){
}
return str;
}
}



