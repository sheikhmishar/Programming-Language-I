import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of rows of numbers: ");
        int numsOfRows = keyboard.nextInt();
        
        for (int countRows = 1; countRows <= numsOfRows; countRows++){
            for (int countSpace = 1; countSpace <= numsOfRows-countRows; countSpace++){
                System.out.print(" ");
                
            }
            for (int countStars = 1; countStars <= countRows; countStars++){
                System.out.print(countStars);
            }
            System.out.print("\n");
        }
    }
}