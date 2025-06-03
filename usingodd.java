//write a java program using exception handling to check the given number is odd or not if it is not odd the print exception

import java.util.Scanner;

public class usingodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if(num % 2 == 0){
                throw new ArithmeticException("\nNumber is not odd");
            }
            else{
                System.out.println("Number is odd");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}