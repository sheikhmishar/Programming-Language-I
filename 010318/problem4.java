import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of rows of numbers: ");
        int numsOfRows = keyboard.nextInt();
        System.out.println("Enter the quantity of numbers in a line: ");
        int numsOfStars = keyboard.nextInt();
        
        for (int countRows = 1; countRows <= numsOfRows; countRows++){
            for(int count = 1; count <= numsOfStars; count++){
                System.out.print(count);
            }
            System.out.print("\n");
        }
    }
}