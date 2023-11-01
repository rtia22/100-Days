import java.util.Scanner;

public class Day024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Luas Segitiga");
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas segitiga adalah: " + luas);

        input.close();
    }
}
