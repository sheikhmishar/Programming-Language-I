import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the quantity of the output in a line: ");
        int quantity = keyboard.nextInt();
        for(int count = 1; count <= quantity; count++){
            System.out.print(count);
        }
        System.out.print("\n");
    }
}