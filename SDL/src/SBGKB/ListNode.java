package SBGKB;

public class ListNode {
    private Object elemen;
    private ListNode next;
    private ListNode prev;

    public Object getElemen() {
        return elemen;
    }

    public void setElemen(Object elemen) {
        this.elemen = elemen;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode() {}

    public ListNode(Object elemen) {
        this(elemen,null,null);
    }

    public ListNode(Object elemen, ListNode next, ListNode prev) {
        this.elemen = elemen;
        this.setNext(next);
        this.setPrev(prev);
    }
    
}
