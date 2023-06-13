package per_3;

import Project.Logistic;

public class staticLarik2  {
    public static void cetak(int[] b) {
        for (int counter = 0; counter < b.length; counter++) {
            System.out.printf("%3d%9d\n", counter, b[counter]);
        }
    }

    public static void cetak(Object[] b) {
        for (int counter = 0; counter < b.length; counter++) {
            System.out.printf("%3d%9d\n", counter, b[counter]);
        }
    }

    public static int sequentialSearch(int[] a, int b) {
        for (int counter = 0; counter <= a.length - 1; counter++) {
            if (b == a[counter]) {
                return counter;
            }
        }
        return -1;

    }

    public static int sequentialSearch(Object[] a, Object b) {
        for (int counter = 0; counter <= a.length - 1; counter++) {
            if((((Comparable)b).compareTo(a[counter]))==0){
                return counter;
            }
        }
        return -1;

    }



    public static int binarySearch(int[] a, int b) {
        int indexAwal = 0, indexAkhir = a.length - 1;

        while (indexAwal <= indexAkhir) {
            int indexTengah = (indexAwal + indexAkhir) / 2;
            if (a[indexTengah] == b) {
                return indexTengah;
            } else if (a[indexTengah] > b) {
                indexAkhir = indexTengah - 1;
            } else {
                indexAwal = indexTengah + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(Object[] a, Object b) {
        int indexAwal = 0, indexAkhir = a.length - 1;

        while (indexAwal <= indexAkhir) {
            int indexTengah = (indexAwal + indexAkhir) / 2;
            if ((((Comparable)a[indexTengah]).compareTo(b))==0) {
                return indexTengah;
            } else if ((((Comparable)a[indexTengah]).compareTo(b))>0) {
                indexAkhir = indexTengah - 1;
            } else {
                indexAwal = indexTengah + 1;
            }
        }
        return -1;
    }

    public static int interpolasiSearch(int[] a, int b) {

        int indexAwal = 0, indexAkhir = a.length - 1;
        while (indexAwal <= indexAkhir) {
            int indexTengah = indexAwal
                    + ((b - a[indexAwal]) * (indexAkhir - indexAwal)) / (a[indexAkhir] - a[indexAwal]);
            if (a[indexTengah] == b) {
                return indexTengah;
            } else if (a[indexTengah] > b) {
                indexAkhir = indexTengah - 1;
            } else {
                indexAwal = indexTengah + 1;
            }
        }
        return -1;
    }
    
    public static void index(int index, String nama) {
        System.out.println("nama metode pencarian : " + nama);
        if (index == -1) {
            System.out.println("Index tidak ditemukan : " + index);
        } else {
            System.out.println("Index ditemukan!!\nindex : " + index);
        }
    }

    public static void bubleSortASC(int[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void bubleSortASC(Object[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 1 - i; j++) {
                if (((Comparable)a[j]).compareTo(a[j+1])>0) {
                    Object temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void bubleSortPrj(Object[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 1 - i; j++) {
                if (((Logistic)a[j]).getTanggal()<((Logistic)a[j+1]).getTanggal()) {
                    Object temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void bubleSortDSC(int[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp;
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void selectionSortASC(Object[] b) {
        for (int i = 0; i <= b.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= b.length - 1; j++) {
                if (((Comparable)b[j]).compareTo(b[minIndex])<0) {
                    minIndex = j;
                    Object temp = b[i];
                    b[i] = b[minIndex];
                    b[minIndex] = temp;

                }
            }
        }
    }
    public static void selectionSortASC(int[] b) {
        for (int i = 0; i <= b.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= b.length - 1; j++) {
                if (b[j] < b[minIndex]) {
                    minIndex = j;
                    int temp = b[i];
                    b[i] = b[minIndex];
                    b[minIndex] = temp;

                }
            }
        }
    }
    public static void selectionSortDSC(int[] b) {
        for (int i = 0; i <= b.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= b.length - 1; j++) {
                if (b[j] > b[minIndex]) {
                    minIndex = j;
                    int temp = b[minIndex];
                    b[minIndex] = b[i];
                    b[i] = temp;

                }
            }
        }
    }

    public static void interSortASC(Object[] b) {
        for (int iterasi = 1; iterasi < b.length; iterasi++) {
            Object simp = b[iterasi];
            int element = iterasi - 1;
            while (element >= 0 && ((Comparable)b[element]).compareTo(simp)<0) {
                b[element + 1] = b[element];
                element--;
            }
            b[element + 1] = simp;
        }

    }

    public static void interSortASC(int[] b) {
        for (int iterasi = 1; iterasi < b.length; iterasi++) {
            int simp = b[iterasi];
            int element = iterasi - 1;
            while (element >= 0 && b[element] > simp) {
                b[element + 1] = b[element];
                element--;
            }
            b[element + 1] = simp;
        }

    }

    public static void interSortDSC(int[] b) {
        for (int iterasi = 1; iterasi < b.length; iterasi++) {
            int simp = b[iterasi];
            int element = iterasi - 1;
            while (element >= 0 && b[element] < simp) {
                b[element + 1] = b[element];
                element--;
            }
            b[element + 1] = simp;
        }
    }


    public static void quickSortAscending(Object[] b, int awal, int akhir) {
        if (awal < akhir) {
            int i = awal + 1, j = akhir;
            while (i <= akhir && ((Comparable)b[i]).compareTo(b[awal])<=0) {
                i++;
            }
            while (j > awal && ((Comparable)b[j]).compareTo(b[awal])>0) {
                j--;
            }
            while (i < j) {
                Object temp = b[i];
                b[i] = b[j];
                b[j] = temp;

                while (i <= akhir && ((Comparable)b[i]).compareTo(b[awal])<=0) {
                    i++;
                }
                while (j > awal && ((Comparable)b[j]).compareTo(b[awal])>0) {
                    j--;
                }

            }

            Object temp = b[awal];
            b[awal] = b[j];
            b[j] = temp;

            quickSortAscending(b, awal, j - 1);
            quickSortAscending(b, j + 1, akhir);
        }
    }

    public static void quickSortAscending(int[] b, int awal, int akhir) {
        if (awal < akhir) {
            int i = awal + 1, j = akhir;
            while (i <= akhir && b[i] <= b[awal]) {
                i++;
            }
            while (j > awal && b[j] > b[awal]) {
                j--;
            }
            while (i < j) {
                int temp = b[i];
                b[i] = b[j];
                b[j] = temp;

                while (i <= akhir && b[i] <= b[awal]) {
                    i++;
                }
                while (j > awal && b[j] > b[awal]) {
                    j--;
                }

            }

            int temp = b[awal];
            b[awal] = b[j];
            b[j] = temp;

            quickSortAscending(b, awal, j - 1);
            quickSortAscending(b, j + 1, akhir);
        }
    }

    public static void quickSortDescending(int[] b, int awal, int akhir) {
        if (awal < akhir) {
            int i = awal + 1, j = akhir;
            while (i <= akhir && b[i] >= b[awal]) {
                i++;
            }
            while (j > awal && b[j] < b[awal]) {
                j--;
            }
            while (i < j) {
                int temp = b[i];
                b[i] = b[j];
                b[j] = temp;

                while (i <= akhir && b[i] >= b[awal]) {
                    i++;
                }
                while (j > awal && b[j] < b[awal]) {
                    j--;
                }

            }

            int temp = b[awal];
            b[awal] = b[j];
            b[j] = temp;

            quickSortDescending(b, awal, j - 1);
            quickSortDescending(b, j + 1, akhir);
        }
    }
}
