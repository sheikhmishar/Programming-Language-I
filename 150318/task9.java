import java.util.Scanner;
public class task9{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[10];
        for(int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number:");
            int num = keyboard.nextInt();
            myArray[count] = num;
        }
        System.out.println("Enter the number to check:");
        int check = keyboard.nextInt();
        String result = "No";
        for(int count = 0; count < myArray.length; count++){
            if(myArray[count] == check){
                result = "Yes";
                break;
            }
        }
        System.out.println(result);
    }
}