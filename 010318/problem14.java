import java.util.Scanner;
public class problem14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of rows of stars: ");
        int numsOfRows = keyboard.nextInt();
        System.out.println("Enter the quantity of stars in a line: ");
        int numsOfStars = keyboard.nextInt();
        
        for (int countRows = 1; countRows <= numsOfRows; countRows++){
            for(int count = 1; count <= numsOfStars; count++){
                if (count == 1 || count == numsOfStars || countRows==1 || countRows==numsOfRows){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}