
import java.util.Scanner;



public class Day073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pajak = 0;
        double gaji;
        String pekerjaan;
        
        gaji = sc.nextDouble();
        pekerjaan = sc.next();
        
        if(gaji>=5000000){
            pajak+=0.1;
        }else if(gaji>=3000000){
            pajak+=0.05;
        }
        
        if(pekerjaan.equalsIgnoreCase("y")){
            pajak+=0.05;
        }
        
        System.out.println(gaji-(gaji*pajak));
        
}
}
