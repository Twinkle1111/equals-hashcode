package com.monami.linkedList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

class ListDemo  {


private Node head;
  private int size;

private class Node<T>{
     T data;
     Node next;
     Node previous;
     Node(T data){
       this.data = data;
     }
     public Node(){
       this.data = null;
       this.next = null;
      }

 public Node(T data, Node<T> next){
   this.data = data;
   this.next = next;
  }

 public T getData(){
   return data;
  }

 public void setData(T data){
   this.data = data;
  }

 public Node<T> getNext(){
   return next;
  }

 public void setNext(Node<T> next){
   this.next = next;
  }


}

public void removeNode(Node node){
     if(size == 0)
       head = null;
      else{
        if(node == head){
             head = node.next;
             node.next.previous = null;
         }
        else{
             node.next.previous = node.previous;
             node.previous.next = node.next;
         }
      }
      size--;
   }

public Node findNode(int index){
     Node myNode;
     myNode = head;
     while( index-- > 0)
       myNode = myNode.next;
     return myNode;
   }  

public ListDemo(String string, int i) {
     head = null;
     size = 0;
   }


}
	class Demo 
	{
	    public static void main (String[] args) 
	    {
	         
	        // creating two Objects with 
	        // same state
	        ListDemo g1 = new ListDemo("aditya", 1);
	        ListDemo g2 = new ListDemo("aditya", 2);
	        System.out.println(g1);
	        System.out.println(g2);
	         
	        Map<ListDemo, String> map = new HashMap<ListDemo, String>();
	        map.put(g1, "CSE");
	        map.put(g2, "IT");
	         
	        for(ListDemo ListDemo : map.keySet())
	        {
	            System.out.println(map.get(ListDemo).toString());
	        }
	 
	    }

}
