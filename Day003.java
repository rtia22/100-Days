import java.util.Scanner;

public class Day003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data bertipe string
        System.out.println("\n==== Input String ====");
        System.out.print("Masukkan Data : ");
        String data = scanner.nextLine();
        System.out.println("Data : " + data);

        // Input data bertipe integer
        System.out.println("\n==== Input Integer ====");
        System.out.print("Masukkan Angka : ");
        int dataInt = scanner.nextInt();
        System.out.println("Data : " + dataInt);

        // Input data bertipe float
        System.out.println("\n==== Input Float ====");
        System.out.print("Masukkan Angka Desimal : ");
        float dataFloat = scanner.nextFloat();
        System.out.println("Data : " + dataFloat);

        // Input data bertipe boolean
        System.out.println("\n==== Input Boolean ====");
        System.out.print("Masukkan boolean 0 atau 1 : ");
        int booleanInput = scanner.nextInt();
        boolean dataBool = (booleanInput == 1);
        System.out.println("Data : " + dataBool);

        // Tutup scanner
        scanner.close();
    }
}
