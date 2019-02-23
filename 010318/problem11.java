import java.util.Scanner;
public class problem11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of rows of numbers: ");
        int numsOfRows = keyboard.nextInt();
        int countRows=1;
        for ( countRows = 1; countRows <= numsOfRows; countRows++){
            for (int countSpace = 1; countSpace <= numsOfRows-countRows; countSpace++){
                System.out.print(" ");
                
            }
            for (int countNumbers = numsOfRows-countRows+1; countNumbers <= numsOfRows; countNumbers++){
                System.out.print(countNumbers);
            }
            System.out.print("\n");
        }
    }
}