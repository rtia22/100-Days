
public class Day087 {

    public static void main(String[] args) {
        String a = "Rahma";
        String b = "Tia";
        System.out.println("sebelum diubah\n" + a + " dan " + b);

        String c = a;
        a = b;
        b = c;

        System.out.println("setelah diubah\n" + a + " dan " + b);

    }
}
