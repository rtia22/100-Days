
import java.util.Scanner;

public class Day055 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int number = sc.nextInt();
        long hasil = calculateFactorial(number);
        System.out.println("Nilai Faktorial dari " + number + " adalah : " + hasil);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
