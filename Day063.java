
import java.util.Arrays;

public class Day063 {

    public static void main(String[] args) {
        // Mendefinisikan array 3D
        int[][][] my3DArray = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        System.out.println("Isi array pada indeks [0][1][2]: " + my3DArray[0][1][2]);

        // Menghapus elemen pada indeks tertentu
        my3DArray[1][1][1] = 0;

        System.out.println("Array setelah menghapus elemen: " + Arrays.deepToString(my3DArray));

        // Mengisi kembali elemen yang sudah dihapus 
        int fillValue = 100;
        my3DArray[1][1][1] = fillValue;

        System.out.println("Array setelah menambah elemen: " + Arrays.deepToString(my3DArray));
    }
}
