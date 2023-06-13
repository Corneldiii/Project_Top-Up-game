package stackstatis;

public class Stack {
    private Object[] elemen;
    private int front;
    private int size;
    
    public Stack(){
        front=-1;
        elemen=new Object[10];
        size=0;
    }

    public Stack(int size){
        front=-1;
        elemen=new Object[size];
        size=0;
    }

    public boolean push(Object nilai){
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

    public Object pop(){
        Object val=0;
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
