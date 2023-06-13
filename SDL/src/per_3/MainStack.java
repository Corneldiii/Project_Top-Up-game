package per_3;


public class MainStack {
    public static void main(String[] args) {
        Stack A=new Stack();
        A.push(23);
        A.push(45);
        A.push(56);

        System.out.println("Ukuran : "+A.size()+" => "+A.toString());
        if(A.isEmptyStck()){
            System.out.println("data sudah habis");
        }else{
            System.out.println("Ukuran : "+A.size()+" => "+A.toString());
        }

        int e=A.pop();
        System.out.println("Data yang di Pop : "+e);
        if(A.isEmptyStck()){
            System.out.println("Data sudah habis");
        }else{
            System.out.println("Ukuran : "+A.size()+" => "+A.toString());
        }
        A.push(56);
        if(A.isEmptyStck()){
            System.out.println("Data sudah habis");
        }else{
            System.out.println("Ukuran : "+A.size()+" => "+A.toString());
        }
        if(A.isEmptyStck()){
            System.out.println("Data sudah habis");
        }else{
            System.out.println("Ukuran : "+A.size()+" => "+A.toString());
        }

        System.out.println("Isi akhir dalam satck ini adalah : \t"+A.toString());
        
        
    }
}
