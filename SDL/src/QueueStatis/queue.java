package QueueStatis;

public class queue {
    private Object[] element;
    private int front;
    private int rear;
    private int size;

    public queue() {
        element = new Object[10];
        front = 0;
        rear = 0;
        size = 0;
    }

    public queue(int ukuran) {
        element = new Object[ukuran];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean enqueue(Object angka) {
        if (size == this.element.length) {
            System.out.println("penuh");
        } else {
            if (rear == element.length) {
                rear = 0;
            }
            element[rear] = angka;
            rear++;
            size++;
        }
        return true;
    }

    public boolean isEmptyQue() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public Object dequeue(){
        Object simp=0;
        if(isEmptyQue()==true){
            return simp;
        }
        if(front==element.length){
            front=0;
        }
        simp=element[front];
        front++;
        size--;
        return simp;
    }

    public String toString() {
        String tampung = "";
        if (isEmptyQue()) {
            tampung = tampung + "Sudah kosong";
        } else {
            if (front == element.length) {
                    front = 0;
                }
            for (int i = front; i < rear; i++) {
                tampung += element[i] + " ";
            }
        }
        return tampung;
    }

}
