package per_3;

public class Stack {
    private int[] elemen;
    private int front;
    private int size;
    
    public Stack(){
        front=-1;
        elemen=new int[10];
        size=0;
    }

    public Stack(int size){
        front=-1;
        elemen=new int[size];
        size=0;
    }

    public boolean push(int nilai){
        if (size == elemen.length) {
            return false;
        }
        front++;
        elemen[front] = nilai;
        size++;
        return true;
    }

    public int size(){
        return size;
    }

    public boolean isEmptyStck(){
        if(size==0){
            return true;
        }
        return false;
    }

    public int pop(){
        int val=0;
        if(isEmptyStck()==true){
            System.out.println("Kosong");
        }else{
            val=elemen[front];
            front--;
            size--;
        }
        return val;
    }
    
    public String toString(){
        String liat="";
        for (int i = 0; i < size; i++) {
            liat=liat+elemen[i]+" ";
        }
        return liat;
    }

}
