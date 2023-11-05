import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Awal: ");
        int awal = scanner.nextInt();

        System.out.print("Masukkan Akhir: ");
        int akhir = scanner.nextInt();

        List<Integer> bilanganPrima = cariBilanganPrima(awal, akhir);
        System.out.println("Bilangan prima antara " + awal + " dan " + akhir + " adalah:");
        for (int prima : bilanganPrima) {
            System.out.print(prima + " ");
        }
    }

    public static boolean isPrima(int x) {
        if (x <= 1) {
            return false; 
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static List<Integer> cariBilanganPrima(int awal, int akhir) {
        List<Integer> listPrima = new ArrayList<>();
        for (int x = awal; x < akhir; x++) {
            if (isPrima(x)) {
                listPrima.add(x);
            }
        }
        return listPrima;
    }
}
