/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabut;

/**
 *
 * @author LENOVO
 */
public class intersort {
    public static void main(String[] args) {
        int[] array={15,8,26,5,11,31};
        
        for (int i = 1; i < array.length; i++) {
            int simp=array[i];
            int j=i-1;
            while(j>=0 && array[j]<simp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=simp;
        }
        System.out.println("Descendng");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
        for (int i = 1; i < array.length; i++) {
            int simp=array[i];
            int j=i-1;
            while(j>=0 && array[j]>simp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=simp;
        }
        System.out.println("");
        System.out.println("Ascending");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
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