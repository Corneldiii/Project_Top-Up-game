package per_3;

public class belajar {
    public static void bublesort(int[] b){
        for (int i = 1; i <= b.length-1; i++) {
            for (int j = 0; j <= b.length-1-i; j++) {
                if(b[j+1]>b[j]){
                    int temp=b[j+1];
                    b[j+i]=b[j];
                    b[j]=temp;
                }
            }
        }
    }
    public static void selectionSort(int[] b){
        for (int i = 0; i <= b.length-2; i++) {
            int minIndex=i;
            for (int j = i+1; j < b.length; j++) {
                if(b[j]>b[minIndex]){
                    minIndex=j;
                    int temp=b[minIndex];
                    b[minIndex]=b[i];
                    b[i]=temp;
                }
            }
        }
    }
    public static void intertionSort(int[] b){
        for (int i = 1; i <= b.length-1; i++) {
            int sisip=b[i];
            int elment=i-1;
            while(elment>=0 && b[elment]>sisip){
                b[elment+1]=b[elment];
                elment--;
            }
            b[elment+1]=sisip;
        }
    }
    public static int binarySearch(int[] b,int  c){
        int indexAwal=0,indexAkhir=b.length-1;
        while(indexAwal<=indexAkhir){
            int indexTengah=(indexAwal+indexAkhir)/2;
            if(b[indexTengah]==c){
                return indexTengah;
            }else if(b[indexTengah]>c){
                indexAkhir=indexTengah-1;
            }else{
                indexAwal=indexTengah+1;
            }
            
        }
        return -1;

    }
    public static int interpolatonSearch(int[] b,int c){
        int indexAwal=0,indexAkhir=b.length-1;
        while(indexAwal<=indexAkhir){
            int indexTengah=indexAwal+((c-b[indexAwal])*(indexAkhir-indexAwal))/(b[indexAkhir]-b[indexAwal]);
            if(b[indexTengah]==c){
                return indexTengah;
            }else if(b[indexTengah]>c){
                indexAkhir=indexTengah-1;
            }else{
                indexAwal=indexTengah+1;
            }
        }
        return-1;
    }
}
