import java.util.Scanner;
public class problem25 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of rows of your desired palindromic triangle: ");
        int quantity = keyboard.nextInt();
        
        for (int row = 1; row <= quantity; row++){
            
            for(int countSpace = 1; countSpace <= quantity - row ; countSpace++){
                System.out.print(" ");
            }
            
            for(int countNumbers=1; countNumbers <= row; countNumbers++){
                System.out.print(countNumbers);
            }
            
            for(int countNumbers= row - 1; countNumbers >= 1; countNumbers--){
                System.out.print(countNumbers);
            }
            System.out.println("");
        }
    }
}