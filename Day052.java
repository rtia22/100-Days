

import java.util.Scanner;

public class Day052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[50];
        int arr_count, i, num;

        System.out.print("Input jumlah elemen Array: ");
        arr_count = sc.nextInt();

        System.out.println("Input " + arr_count + " angka (dipisah dengan enter): ");
        System.out.println();

        //Simpan setiap angka yang diinput ke dalam array
        for (i = 0; i < arr_count; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println();

        System.out.print("Input angka yang akan dicari: ");
        num = sc.nextInt();

        //Proses pencarian Array
        for (i = 0; i < arr_count; i++) {
            if (arr[i] == num) {
                System.out.print("Angka ditemukan pada index ke-" + i);
                break;
            }

        }

        if (i == arr_count) {
            System.out.println("Angka tidak ditemukan");
        }

        System.out.println();
    }

}
