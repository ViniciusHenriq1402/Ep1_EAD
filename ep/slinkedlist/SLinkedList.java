/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep.slinkedlist;

/**
 *
 * @author Vini
 */
public class SLinkedList {
    
  protected Node head, tail;
  protected long size;

  public SLinkedList(){
    head = tail = null;
    size = 0;
  }

  public long size(){ return size; }

  public boolean isEmpty(){ return(size == 0); }

  public void addFirst(Node n){
    n.setNext(head);
    head = n;
    if(isEmpty()){ tail = n; }
    size++;
  }

  public void addLast(Node n){
    n.setNext(null);
    tail.setNext(n);
    tail = n;
    if(isEmpty()){ head = n; }
    size++;
  }

  public Node removeFirst() throws IllegalStateException{
    if(isEmpty()){ throw new IllegalStateException("Lista vazia"); }
    Node tmp = head;
    head = head.getNext();
    tmp.setNext(null);
    size--;
    if(isEmpty()){ tail = null; }

    return tmp;
  }

  public String toString(){
    String s = "[";
    for(Node n = head; n != null; n = n.getNext()){
      s += n.getElement();
      if(n != tail){ s += ", "; }
    }
    return s + "]";
  }
  
}
