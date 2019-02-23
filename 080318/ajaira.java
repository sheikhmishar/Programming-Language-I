import java.util.*;

public class ajaira{
    
    public static void main(String[] args){
        
            Scanner keyboard = new Scanner(System.in);
            int num1= keyboard.nextInt();
            int num2= keyboard.nextInt();
            
        for(int num3=num1; num3<=num2; num3++){
            int divCount=0;
            for(int count = num1; count <= num2; count++){
                if ( num2%count==0){
                    divCount++;
                }
            }
            if ( divCount==2){
                System.out.println(num2);
            }
        }
    }
    
}