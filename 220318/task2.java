import java.util.Scanner;

public class task2{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[5];
        int max=0, location= 0;
        for (int count = 0; count < myArray.length; count++){
            int num = keyboard.nextInt();
            myArray[count] = num;
            if ( count == 0 ){
                max = myArray[count];
                location = count;
            }
            if (myArray[count] > max){
                max = myArray[count];
                location = count;
            }
        }
        System.out.println("Largest number "+max+" was found at location "+ location);
    }
}