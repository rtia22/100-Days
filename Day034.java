
import java.util.Stack;


public class Day034 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Rahma");
        stack.push("Tia");
        System.out.println(stack);
        
        stack.push("cantikkk");
        System.out.println(stack);
        
        String value = stack.pop();
        System.out.println("POP : " + value);
        System.out.println(stack);
        
        value = stack.peek();
        System.out.println("PEEK : " + value);
        System.out.println(stack);
 
        
    }
}
