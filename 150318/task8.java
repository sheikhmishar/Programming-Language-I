import java.util.Scanner;
public class task8{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[10];
        for(int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number:");
            int num = keyboard.nextInt();
            myArray[count] = num;
        }
        for(int count = myArray.length-1; count >=0 ; count--){
            
            if (myArray[count] % 2 == 0){
                if(count == 0){
                    System.out.print(myArray[count]);
                }
                else{
                    System.out.print(myArray[count]+", ");
                }
            }
            
        }
    }
}