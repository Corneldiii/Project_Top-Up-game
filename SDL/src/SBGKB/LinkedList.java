package SBGKB;

import java.util.NoSuchElementException;

import Project.Logistic;

public class LinkedList {
    private ListNode head;
    private int size;


    public int getSize() {
        return size;
    }

    public LinkedList(){
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

    public void print2(){
        ListNode bantu=head.getNext();
        if(bantu==head){
            System.out.println("Sudah kosong");
        }else{
            System.out.printf("%-10s%-12s","NAMA","EXP");
            while(bantu!=head){
                System.out.printf("\n%-10s%-1s%-1s",((Logistic)bantu.getElemen()).getNama(),((Logistic)bantu.getElemen()).getTanggal(),"/10/23");
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

    public void addSort(Object key){
        ListNode bantu=head.getNext();
        while(bantu != head){
            if(((Comparable) bantu.getElemen()).compareTo(key) > 0){
			    addBefore(key,bantu);
                return;
		    }
            bantu=bantu.getNext();
        }
        addLast(key);
        
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

    public Object removePilih(Object key){
        ListNode bantu=head.getNext();
        while(bantu != head){
            if(key.equals(((Logistic)bantu.getElemen()).getNama())){
                return remove(bantu);
            }
            bantu=bantu.getNext();
        }
        return null;
    }
    
    public Object removeFirst(){
        return remove(head.getNext());
    }
    
    public Object removeLast(){
        return remove(head.getPrev());
    }
}
