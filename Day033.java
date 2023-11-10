
public class Day033 {
    public static void main(String[] args) {
        int n = 5; // Ubah n sesuai dengan bilangan Fibonacci yang ingin dihitung
        System.out.println("Bilangan Fibonacci ke-" + n + " adalah " + fibonacci(n));
    }

    // Method rekursif non-static untuk menghitung bilangan Fibonacci ke-n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
