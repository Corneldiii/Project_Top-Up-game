/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punyaKawan;

/**
 *
 * @author User
 */
public class ListNode {

  private int elemen;
  private ListNode next;
  private ListNode prev;
  
  public int getElemen(){
      return elemen;
  }
  public void setElemen(int elemen){
      this.elemen = elemen;
  }
  public ListNode getNext(){
      return next;
  }
  public void setNext(ListNode next){
      this.next = next;
  }
  public ListNode getPrev(){
      return prev;
  }
  public void setPrev(ListNode prev){
      this.prev = prev;
  }
  public ListNode(){}
      
  public ListNode(int elemen){
      this(elemen,null,null);
  }
  public ListNode(int elemen,ListNode prev,ListNode next){
      this.elemen = elemen;
      this.setPrev(prev);
      this.setNext(next);
  }
    
}
