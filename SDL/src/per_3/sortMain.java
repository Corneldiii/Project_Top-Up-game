package per_3;


public class sortMain {
    public static void main(String[] args) {
        int[] larik={5,8,26,15,11,31,7,40,23,25};
        staticLarik2.interSortDSC(larik);
        staticLarik2.cetak(larik);
        System.out.println("Acak");
        staticLarik2.cetak(larik);
        System.out.println("bubble sort");
        System.out.println("ASCENDING");
        staticLarik2.bubleSortASC(larik);
        staticLarik2.cetak(larik);
        System.out.println("DESCENDING");
        staticLarik2.bubleSortDSC(larik);
        staticLarik2.cetak(larik);
        System.out.println("Selection Sort");
        System.out.println("ASCENDING");
        staticLarik2.selectionSortASC(larik);
        staticLarik2.cetak(larik);
        System.out.println("DESCENDING");
        staticLarik2.selectionSortDSC(larik);
        staticLarik2.cetak(larik);
        System.out.println("Inter Sort");
        System.out.println("ASCENDING");
        staticLarik2.interSortASC(larik);
        staticLarik2.cetak(larik);
        System.out.println("DESCENDING");
        staticLarik2.interSortDSC(larik);
        staticLarik2.cetak(larik);
        System.out.println("Quick Sort");
        System.out.println("ASCENDING");
        staticLarik2.quickSortAscending(larik, 0, larik.length-1);
        staticLarik2.cetak(larik);
        System.out.println("DESCENDING");
        staticLarik2.quickSortDescending(larik, 0, larik.length-1);
        staticLarik2.cetak(larik);
        System.out.println("O B J E C T");
        System.out.println("Buble sort asc");
        staticLarik2.bubleSortASC(larik);
        
        
    }
}

