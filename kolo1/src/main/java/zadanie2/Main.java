package zadanie2;
import java.util.Scanner;

public class Main {
    
     

     public static int fib(int n) {

       if ((n == 1) || (n == 2)) {
            return 1;
       } else {

            return fib(n - 1) + fib(n - 2);

        }
    }
     
    
    public static void main(String[] args) {
        
        System.out.println("Podaj n: ");
        Scanner input=new Scanner(System.in);
        int b=input.nextInt();
       System.out.print(fib(b));
        
        
       
      
    }
    
}
