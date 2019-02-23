import java.util.Scanner;
public class problem21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of rows of numbers: ");
        int numsOfRows = keyboard.nextInt();
        int starLimit=1;
        
        for (int countRows = 1; countRows <= numsOfRows; countRows++){
            for (int countSpace = 1; countSpace <= numsOfRows-countRows; countSpace++){
                System.out.print(" ");
                
            }
            for (int countStars = 1; countStars <= starLimit; countStars++){
                if (countStars == 1 || countStars == starLimit || countRows==1 || countRows==numsOfRows){
                    System.out.print(countStars);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            starLimit += 2;
        }
    }
}