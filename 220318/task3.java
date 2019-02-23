import java.util.Scanner;

public class task3{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[5];
        int max=0, min=0, locationMin= 0, locationMax=0;
        for (int count = 0; count < myArray.length; count++){
            int num = keyboard.nextInt();
            myArray[count] = num;
            if ( count == 0 ){
                max = myArray[count];
                min = myArray[count];
                locationMin = count;
                locationMax = count;
            }
            if (myArray[count] > max){
                max = myArray[count];
                locationMax = count;
            }
            if (myArray[count] < min){
                min = myArray[count];
                locationMin = count;
            }
        }
        System.out.println("Smallest number "+min+" was found at location "+ locationMin);
        System.out.println("Largest number "+max+" was found at location "+ locationMax);
    }
}