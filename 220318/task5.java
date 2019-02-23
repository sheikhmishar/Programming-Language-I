import java.util.Scanner;

public class task5{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[5];
        int max = 0, locationMax = 0;
        for (int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number: ");
            int num = keyboard.nextInt();
            myArray[count] = num;
        }
        for (int count = 0; count < myArray.length -1; count++){
            max = myArray[count];
            locationMax = count;
            for (int comparer = count + 1; comparer < myArray.length; comparer++){
                if (myArray[comparer] > max){
                    max = myArray[comparer];
                    locationMax = comparer;
                }
            }
            int temp = myArray[count];
            myArray[count] = myArray[locationMax];
            myArray[locationMax] = temp;
        }
        for (int count = 0; count < myArray.length; count++){
            if (count == myArray.length-1){
                System.out.println(myArray[count]);
            }
            else{
            System.out.print(myArray[count] + ", ");
            }
        }
    }
}