
import java.util.Scanner;

public class Day043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan nilai a : ");
            int a = sc.nextInt();
            System.out.println("Masukkan nilai b : ");
            int b = sc.nextInt();

            int c = a * b;
            if (c % 2 == 0) {
                System.out.println(c + 1 + " ganjil");
            } else {
                System.out.println(c + 1 + " genap");
                break;
            }

        }
    }
}
