import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[10];
        for(int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number:");
            int num = keyboard.nextInt();
            myArray[count] = num;
        }
        System.out.println("Enter the index number:");
        int index = keyboard.nextInt();
        if ( index >=0 && index < myArray.length ){
            System.out.println(myArray[index]);
        }
    }
}