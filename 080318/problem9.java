import java.util.Scanner;

public class problem9{
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = keyboard.nextInt();
        int divisor = 0, sum = 0;
        for(int count = 1; count < num; count++){
            if ( num%count == 0){
                sum += count;
            }
        }
        if (sum == num){
            System.out.println("The number is perfect");
        }
        else {
            System.out.println("The number is  not perfect");
        }
        
    }
    
}