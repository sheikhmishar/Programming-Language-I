import java.util.Scanner;
public class problem24 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the highest number of palindrome: ");
        int highest = keyboard.nextInt();
        
        for(int count=1; count <= highest; count++){
            System.out.print(count);
        }
        
        for(int count=highest-1; count >= 1; count--){
            System.out.print(count);
        }
        
    }
}