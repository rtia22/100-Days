
import java.util.Scanner;


public class Day041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nama : ");
        String nama = sc.nextLine();
        System.out.print("masukkan password : ");
        String pass = sc.nextLine();
   
        
        if("RHMA".equals(nama) && "D210310".equals(pass) ){
            System.out.println("login berhasil");
        }else{
            System.out.println("tidak berhasil");
        }
    }
}

