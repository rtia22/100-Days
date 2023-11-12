
import java.util.LinkedList;
import java.util.Queue;

public class Day035 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Rahma");
        queue.offer("Tia");
        System.out.println(queue);
        
        //menambahkan data
        queue.offer("cantikkk");
        System.out.println(queue);
        
        //mengahpus elemen pertama
        String value = queue.poll();
        System.out.println("POLL : " + value);
        System.out.println(queue);
        
        //membaca tanpa menghapus
        value = queue.peek();
        System.out.println("PEEK : " + value);
        System.out.println(queue);
 
        
    }
}
