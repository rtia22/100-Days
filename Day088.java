import java.util.Scanner;

public class Day088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("Masukkan angka (0 untuk keluar): ");
            userInput = scanner.nextInt();
            System.out.println("Anda memasukkan: " + userInput);
        } while (userInput != 0);

        System.out.println("Program selesai.");
    }
}
