import java.util.Scanner;

public class problem8{
    
    public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = keyboard.nextInt();
            int divCount=0;
            for(int count=1; count<=num; count++){
                if ( num%count==0){
                    System.out.println(count);
                    divCount++;
                }
            }
            System.out.println("There are "+divCount+" divisors of "+num);
            
         
    }
    
}