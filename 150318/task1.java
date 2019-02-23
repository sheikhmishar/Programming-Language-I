import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[3];
        int sum = 0;
        for(int count = 0; count < myArray.length; count++){
            System.out.print("Enter a number:");
            int num = keyboard.nextInt();
            myArray[count] = num;
            sum += num;
        }
        System.out.print(sum+", ");
        for(int count = 0; count < myArray.length; count++){
            if (count == myArray.length -1){
                System.out.print(myArray[count]);
            }
            else{
                System.out.print(myArray[count]+", ");
            }
        }
    }
}