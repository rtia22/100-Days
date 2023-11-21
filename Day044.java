import java.util.Scanner;
   
public class Day044 {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Cek Tahun Kabisat  ##");
  
    int year;
     
    System.out.print("Input tahun: ");
    year = input.nextInt();
     
    if (year % 400 == 0) {
      System.out.println(year + " adalah tahun kabisat");
    }
    else if (year % 100 == 0) {
      System.out.println(year + " bukan tahun kabisat");
    }
    else if (year % 4 == 0) {
      System.out.println(year + " adalah tahun kabisat");
    }
    else {
      System.out.println(year + " bukan tahun kabisat");
    }
        
  }
}