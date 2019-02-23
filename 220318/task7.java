import java.util.Scanner;

public class task7{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[10];
        int min=0, locationMin= 0;
        for (int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number: ");
            int num = keyboard.nextInt();
            myArray[count] = num;
        }
        for (int count = 0; count < myArray.length -1; count++){
            min = myArray[count];
            locationMin = count;
            for (int comparer = count + 1; comparer < myArray.length; comparer++){
                if (myArray[comparer] < min){
                    min = myArray[comparer];
                    locationMin = comparer;
                }
            }
            int temp = myArray[count];
            myArray[count] = myArray[locationMin];
            myArray[locationMin] = temp;
        }
        for (int count = 0; count < myArray.length; count++){
            if (count % 2 == 0){
                System.out.print(myArray[count] + ", ");
            }
        }
        for (int count = 0; count < myArray.length; count++){
            if (count % 2 != 0){
                if (count == myArray.length-1){
                    System.out.println(myArray[count]);
                }
                else{
                    System.out.print(myArray[count] + ", ");
                }
            }
        }
    }
}