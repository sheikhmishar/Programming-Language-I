import java.util.Scanner;
public class task10{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[10];
        for(int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number:");
            int num = keyboard.nextInt();
            myArray[count] = num;
            for ( int temp = 0; temp <= count; temp++ ){
                if (temp==count){
                    System.out.print(myArray[temp]);
                }
                else 
                    System.out.print(myArray[temp]+", ");
            }
            System.out.println();
        }
        
    }
}
