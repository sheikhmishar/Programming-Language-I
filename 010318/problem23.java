import java.util.Scanner;
public class problem23 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of rows of numbers: ");
        int numsOfRows = keyboard.nextInt();
        int starLimit=1, countRows=1;
        
        for (countRows = 1; countRows <= numsOfRows; countRows++){
            for (int countSpace = 1; countSpace <= numsOfRows-countRows; countSpace++){
                System.out.print(" ");
                
            }
            for (int countStars = 1; countStars <= starLimit; countStars++){
                if (countStars == 1 || countStars == starLimit){
                    System.out.print(countStars);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            starLimit += 2;
        }
        
        starLimit -=4;
        for (countRows = 1; countRows <= numsOfRows-1; countRows++){
            for (int countSpace = 1; countSpace <= countRows; countSpace++){
                System.out.print(" ");   
            }
            for (int countStars = 1; countStars <= starLimit; countStars++){
                if (countStars == 1 || countStars == starLimit){
                    System.out.print(countStars);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            starLimit -= 2;
        }
        
    }
}