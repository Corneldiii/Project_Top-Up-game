
package punyaKawan;

/**
 *
 * @author ACER
 */
public class mainStack {
    public static void main(String[] args) {
        Stack A = new Stack();
        A.push(23);
        A.push(45);
        A.push(56);

        System.out.println("Ukuran : " + A.size() + " => " + A.toString());
        if (A.isEmptystck()) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran :" + A.size() + " => " + A.toString());
        }
        int e = A.pop();
        System.out.println("data yang di poo : " + e);
        if (A.isEmptystck()) {
            System.out.println("data sudah habsi");
        } else {
            System.out.println("Ukuran : " + A.size() + " => " + A.toString());
        }
        A.push(56);
        if (A.isEmptystck()) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("ukuran :" + A.size() + " => " + A.toString());
        }
        if (A.isEmptystck()) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("ukuran :" + A.size() + " => " + A.toString());
        }
        System.out.println("isi akhir dalam stcak ini adalah :\t" + A.toString());

    }

}
