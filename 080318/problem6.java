import java.util.Scanner;

public class problem6{
    
    public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the quantity:");
            int quantity = keyboard.nextInt();
            for(int count=1; count <= quantity; count++){
                System.out.println("Enter a number:");
                int num = keyboard.nextInt();
                if(num%2==0){
                
                    System.out.println("The number "+ num+" is even");
                
                }
                else {
                
                    System.out.println("The number "+ num+" is odd");
                
                }
               
            }
         
    }
    
}