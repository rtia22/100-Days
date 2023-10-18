import java.util.Scanner;

public class Day010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Masukkan sebuah angka (0 untuk keluar): ");
            number = input.nextInt();
            System.out.println("angka yang dimasukkan " + number);
        } while (number != 0);
        System.out.println("Program selesai.");
    }
}
