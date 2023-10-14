
import java.util.Scanner;

public class Day006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int angka = sc.nextInt();
        if (angka > 100) {
            System.out.println("tidak ada nilai yang lebih dari 100");
        } else if (angka >= 90 && angka == 100) {
            System.out.println("A");
        } else if (angka >= 75 && angka < 90) {
            System.out.println("B");
        } else if (angka >= 60 && angka < 75) {
            System.out.println("C");
        } else if(angka >= 45 && angka < 60) {
            System.out.println("D");
        }else{
            System.out.println("Eror");
        }
                
    }

}
