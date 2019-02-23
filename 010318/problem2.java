import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of stars in a line: ");
        int quantity = keyboard.nextInt();
        for(int count=1; count<= quantity; count++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}