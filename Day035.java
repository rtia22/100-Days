
import java.util.LinkedList;
import java.util.Queue;

public class Day035 {
    public static void main(String[] args) {
        Queue<String> stack = new LinkedList<>();
        stack.offer("Rahma");
        stack.offer("Tia");
        System.out.println(stack);
        
        //menambahkan data
        stack.offer("cantikkk");
        System.out.println(stack);
        
        //mengahpus elemen pertama
        String value = stack.poll();
        System.out.println("POP : " + value);
        System.out.println(stack);
        
        //membaca tanpa menghapus
        value = stack.peek();
        System.out.println("PEEK : " + value);
        System.out.println(stack);
 
        
    }
}
