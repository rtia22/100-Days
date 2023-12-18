
import java.util.Scanner;

public class Day071 {

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 2, 8, 1, 6, 7, 8, 6, 2, 3};
        int x = new Scanner(System.in).nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;

            }

        }
        System.out.println("pos : " + index);

    }
}
