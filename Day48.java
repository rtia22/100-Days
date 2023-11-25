import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang Alas Jajargenjang: ");
        double panjangAlas = sc.nextDouble();

        System.out.print("Masukkan Tinggi Jajargenjang: ");
        double tinggi = sc.nextDouble();

        System.out.print("Masukkan Panjang Sisi Jajargenjang: ");
        double panjangSisi = sc.nextDouble();

        double luas = panjangAlas * tinggi;
        double keliling = 2 * (panjangAlas + panjangSisi);

        System.out.println("Luas Jajargenjang: " + luas);
        System.out.println("Keliling Jajargenjang: " + keliling);

        sc.close();
    }
}
