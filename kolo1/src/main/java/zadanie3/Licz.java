
package zadanie3;
import java.util.Scanner;

public class Licz {
    
      public  int[] tab= new int[10];
      Scanner input=new Scanner(System.in);
      
      public void wprowadz(){
      
      for(int i=0;i<10;i++){
      
          tab[i]=input.nextInt();
      }
      }
      
      
      public void poka(){
            
          for(int i=0;i<10;i++){
          
          System.out.println(tab[i]);
          }
      }
          public void srednia(){
          
         int suma=0,sr=0;
         
          for(int i=0;i<10;i++){
          
          suma+=tab[i];
          }
          sr=suma/10;
          
          }
      
      
    
    
}
