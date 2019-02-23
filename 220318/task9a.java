import java.util.Scanner;

public class task9a{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[15];
        for(int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number :");
            myArray[count] = keyboard.nextInt();
        }
        
        for(int count = 0; count < 10; count++){
            int quantity = 0;
            for(int innerCount = 0; innerCount < myArray.length; innerCount++){
                if (count == myArray[innerCount]){
                    quantity++;
                }                
            }
            System.out.println(count+" has been entered "+quantity+" times");
        }
    }
}
