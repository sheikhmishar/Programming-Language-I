import java.util.Scanner;

public class task9c{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[15];
        int secondArray[] = new int[10];
        for (int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number :");
            int num = keyboard.nextInt();
            myArray[count] = num;
            secondArray[num]++;
        }
        for (int count = 0; count < secondArray.length; count++){
            System.out.println("Quantity of "+count+"= "+ secondArray[count]);
        }
    }
}
