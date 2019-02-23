import java.util.Scanner;

public class task9b{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int myArray[] = new int[15];
        int countZero = 0, countOne = 0, countTwo = 0, countThree = 0, countFour = 0, countFive = 0, countSix = 0, countSeven = 0, countEight = 0, countNine = 0;
        for (int count = 0; count < myArray.length; count++){
            System.out.println("Enter a number :");
            int num = keyboard.nextInt();
            myArray[count] = num;
            if(num == 0)
                countZero++;
            if(num == 1)
                countOne++;
            if(num == 2)
                countTwo++;
            if(num == 3)
                countThree++;
            if(num == 4)
                countFour++;
            if(num == 5)
                countFive++;
            if(num == 6)
                countSix++;
            if(num == 7)
                countSeven++;
            if(num == 8)
                countEight++;
            if(num == 9)
                countNine++;
        }
        System.out.println("Quantity of 0= "+ countZero);
        System.out.println("Quantity of 1= "+ countOne);
        System.out.println("Quantity of 2= "+ countTwo);
        System.out.println("Quantity of 3= "+ countThree);
        System.out.println("Quantity of 4= "+ countFour);
        System.out.println("Quantity of 5= "+ countFive);
        System.out.println("Quantity of 6= "+ countSix);
        System.out.println("Quantity of 7= "+ countSeven);
        System.out.println("Quantity of 8= "+ countEight);
        System.out.println("Quantity of 9= "+ countNine);
    }
}
