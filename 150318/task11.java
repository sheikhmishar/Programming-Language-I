import java.util.Scanner;
public class task11{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[10];
        for(int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number:");
            int num = keyboard.nextInt();
            int result = 0;
            for(int innerCount = 0; innerCount < count; innerCount++){
                if(myArray[innerCount] == num){
                    result = 1;
                    System.out.println("Input another number:");
                    count--;
                    break;
                }
            }
            if (result == 0){
                myArray[count] = num;
            }
        }
    }
}