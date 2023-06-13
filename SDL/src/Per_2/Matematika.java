/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per_2;

/**
 *
 * @author LENOVO
 */
public class Matematika {
    static int faktorial=1;
    public static int faktorialIteratif(int n){
        
        for (int i = 1; i <= n; i++) {
           faktorial*=i;
        }
        return faktorial;
    }
    public static int faktorialRekrusif(int c){
        if(c==1){
            return 1;
        }
        return c*faktorialRekrusif(c-1);
    }
}
