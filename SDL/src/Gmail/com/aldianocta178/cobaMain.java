/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gmail.com.aldianocta178;

/**
 *
 * @author LENOVO
 */
public class cobaMain {
    public static void main(String[] args) {
        int[] array={5,3,1,9,7};
        
        for (int i = 1; i < array.length-1; i++) {
            int simp=array[i];
            int elemen;
            for(elemen=i;elemen>=1;elemen--){
                if(simp<array[elemen-1]){
                    array[elemen]=array[elemen-1];
                }
                break;
            }
            array[elemen]=simp;
            
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }
}
//public static void main(String[] args) {
//        int[] array={15,8,26,5,11,31};
//        
//        for (int i = 1; i < array.length; i++) {
//            int simp=array[i];
//            int j=i-1;
//            while(j>=0 && array[j]>simp){
//                array[j+1]=array[j];
//                j--;
//            }
//            array[j+1]=simp;
//        }
//        for(int i=0;i<array.length;i++){
//            System.out.print(array[i]+" ");
//        }
//        
//    }