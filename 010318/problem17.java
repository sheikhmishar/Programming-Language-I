import java.util.Scanner;
public class problem17 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of rows of numbers: ");
        int numsOfRows = keyboard.nextInt();
        
        for (int countRows = 1; countRows <= numsOfRows; countRows++){
            for (int countStars = 1; countStars <= countRows; countStars++){
                if (countStars == 1 || countStars == countRows || countRows==1 || countRows==numsOfRows){
                    System.out.print(countStars);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}