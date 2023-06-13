package linkedlist;

import java.util.NoSuchElementException;

import Project.Logistic;

public class LinkedList {
    private ListNode head;
    private int size;


    public int getSize() {
        return size;
    }

    LinkedList(){
        head=new ListNode();
        head.setNext(head);
        head.setPrev(head);
        size=0;
    }

    private void addBefore(Object elemen,ListNode bantu){
        ListNode baru = new ListNode(elemen);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.getPrev().setNext(baru);
        bantu.setPrev(baru);
        size++;
    }
    
    public void addFirst(Object elemen){
        addBefore(elemen, head.getNext());
    }

    public void addLast(Object elemen){
        addBefore(elemen,head);
    }

    public void print(){
        ListNode bantu=head.getNext();
        if(bantu==head){
            System.out.println("Sudah kosong");
        }else{
            while(bantu!=head){
                System.out.print(bantu.getElemen()+" ");
                bantu=bantu.getNext();
            }
        }
    }

    public ListNode search(Object key){
        ListNode bantu=head.getNext();
        while(bantu != head){
            if(key==bantu.getElemen()){
                return bantu;
            }
            bantu=bantu.getNext();
        }
        return null;
    }

    public ListNode removePilih(Object key){
        ListNode bantu=head.getNext();
        while(bantu != head){
            if(key==((Logistic)bantu.getElemen()).getNama()){
                if(isEmpty()){
                    throw new NoSuchElementException("======================\nTidak ada isi\n=======================");
                }
                bantu.getPrev().setNext(bantu.getNext());
                bantu.getNext().setPrev(bantu.getPrev());
                size--;
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
    
    public Object remove(ListNode bantu){
        if(isEmpty()){
            throw new NoSuchElementException("======================\nTidak ada isi\n=======================");
        }
        bantu.getPrev().setNext(bantu.getNext());
        bantu.getNext().setPrev(bantu.getPrev());
        size--;
        return bantu.getElemen();
        
    }
    
    public Object removeFirst(){
        return remove(head.getNext());
    }
    
    public Object removeLast(){
        return remove(head.getPrev());
    }
}
