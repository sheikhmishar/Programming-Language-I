import java.util.Scanner;

public class problem7{
    
    public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the quantity:");
            int quantity = keyboard.nextInt();
            System.out.println("Enter the first number:");
            int num = keyboard.nextInt();
            int min = num; int max= num; int sum= num;
            for(int count=1; count <= quantity-1; count++){
                System.out.println("Enter another number:");
                num = keyboard.nextInt();
                if (num<min){
                min=num;
                }
                if (num>max){
                max=num;
                }
                sum += num;
               
            }
            double avg = sum/(double)quantity;
            System.out.println("Average = "+ avg);
            System.out.println("Minimum = "+ min);
            System.out.println("Maximum = "+ max);
            
         
    }
    
}