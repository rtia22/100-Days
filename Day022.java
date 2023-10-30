

import java.util.Scanner;
import java.util.Stack;

public class Day022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Character> data = new Stack<>();
        String kata = sc.nextLine();
        for (int i = 0; i < kata.length(); i++) {
            data.push(kata.charAt(i));
            
        }
        while(!data.isEmpty()){
            System.out.print(data.pop());
        }

    }
}
