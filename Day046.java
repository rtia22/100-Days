
import java.util.Scanner;


public class Day046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang : ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan Lebar : ");
        int lebar = sc.nextInt();
        System.out.print("Masukkan Tinggi : ");
        int tinggi = sc.nextInt();
        
        int luasBalok = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);
        int volumeBalok = panjang * lebar * tinggi;
        int kelilingBalok = 2 * (panjang * lebar * tinggi);
        
        System.out.println("Luas Balok : " + luasBalok);
        System.out.println("Volume Balok : " + volumeBalok);
        System.out.println("Kelliling Balok : " + kelilingBalok);
        
    }
}
