package per_3;


public class MainQueue {
    public static void main(String[] args) {
        queue antrian = new queue(7);
        antrian.enqueue(26);
        antrian.enqueue(15);
        antrian.enqueue(8);
        antrian.enqueue(14);
        antrian.enqueue(3);
        antrian.enqueue(2);
        antrian.enqueue(12);
        
        
        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");

        System.out.println(" keluar " + antrian.dequeue());
        System.out.println(" keluar " + antrian.dequeue());
        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");
        System.out.println(" keluar " + antrian.dequeue());
        System.out.println(" keluar " + antrian.dequeue());
        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");
        System.out.println(" keluar " + antrian.dequeue());
        System.out.println(" keluar " + antrian.dequeue() + "\n");

        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");
        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");
        
        
        antrian.enqueue(5);
        antrian.enqueue(3);
        antrian.enqueue(2);
        
       
        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");
    }
}
