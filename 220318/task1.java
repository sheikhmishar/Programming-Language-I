import java.util.Scanner;

public class task1{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[5];
        int max=0, location= 0;
        for (int count = 0; count < myArray.length; count++){
            int num = keyboard.nextInt();
            myArray[count] = num;
            if ( count == 0 ){
                max = myArray[count];
            }
            if (myArray[count] > max){
                max = myArray[count];
            }
        }
        System.out.println("Largest number "+max);
    }
}