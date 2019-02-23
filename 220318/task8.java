import java.util.Scanner;

public class task8{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String myArray[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println("Enter index: ");
        int index = keyboard.nextInt();
        System.out.println(myArray[index]);
        
    }
}