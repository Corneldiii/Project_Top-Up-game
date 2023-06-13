/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punyaKawan;
import java.util.NoSuchElementException;
/**
 *
 * @author User
 */
public class LinkedList {
    ListNode head;
    int size;
    
    LinkedList(){
        head=new ListNode();
        head.setNext(head);
        head.setPrev(head);
        size=0;
    }
    private void addBefore(int elemen,ListNode bantu){
        ListNode terbaru = new ListNode(elemen);
        terbaru.setNext(bantu);
        terbaru.setPrev(bantu.getPrev());
        bantu.getPrev().setNext(terbaru);
        bantu.setPrev(terbaru);
        size++;
        
    }
    public void addFirst(int elemen){
        addBefore(elemen,head.getNext());
    }
    public void addLast(int elemen){
        addBefore(elemen,head);
    }
    public void print(){
        ListNode bantu=head.getNext();
        if(bantu==head){
            System.out.println("telah kosong");
        }else{
            while(bantu!=head){
                System.out.print(bantu.getElemen()+" ");
                bantu=bantu.getNext();
                
            }
        
        }
    }
    public ListNode search(int kunci){
        ListNode bantu=head.getNext();
        while(bantu!=head){
            if(kunci==bantu.getElemen()){
                return bantu;
            }
            bantu=bantu.getNext();
        }
        return null;
    }
    public boolean isEmpty(){
        if(head.getNext()==head){
            return true;
        }
        return false;
    }
    public int remove(ListNode bantu){
        if(isEmpty()){
            throw new NoSuchElementException("**********\nData Kosong\n**********");
        }
        bantu.getPrev().setNext(bantu.getNext());
        bantu.getNext().setPrev(bantu.getPrev());
        size--;
        return bantu.getElemen();
    }
    public int removeFirst(){
        return remove(head.getNext());
    }
    public int removeLast(){
        return remove(head.getPrev());
    }
}
