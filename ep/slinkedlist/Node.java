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
  
public class Node {
  private Integer element;
  private Node next;

  public Node(Integer s, Node n){
    element = s;
    next = n;
  }

  public Integer getElement(){ return element; }
  public Node getNext(){ return next; }
  public void setElement(Integer newElement){ element = newElement; }
  public void setNext(Node newNext){ next = newNext; }
  
}
