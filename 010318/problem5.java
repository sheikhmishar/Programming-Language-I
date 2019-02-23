import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of rows of stars: ");
        int numsOfRows = keyboard.nextInt();
        
        for (int countRows = 1; countRows <= numsOfRows; countRows++){
            for (int countStars = 1; countStars <= countRows; countStars++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}