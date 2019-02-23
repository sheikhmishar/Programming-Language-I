import java.util.Scanner;

public class problem10{
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = keyboard.nextInt();
        int divCount=0;
        for(int count=1; count<=num; count++){
            if ( num%count==0){
                divCount++;
            }
        }
        if ( divCount==2){
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number is not prime");
        }
        
    }
    
}