
public class Day059 {

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},};

        int[][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1},};

        int[][] hasil = new int[3][3];

        System.out.println("Matriks A:");
        printArray(a);

        System.out.println("\nMatriks B:");
        printArray(b);

        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil.length; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\nHasil Penjumlahan:");
        printArray(hasil);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
