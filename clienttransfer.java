import java.util.Scanner;
public class clienttransfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        String number = scanner.nextLine();
        if (number.length() != 5) {
            System.out.println("Invalid input. Please enter exactly 5 digits.");
            return;
        }
        char first = number.charAt(1);
        char second = number.charAt(0); 
        char third = number.charAt(3);
        char fourth = number.charAt(2);
        char fifth = number.charAt(4);
        String result = "" + first + second + third + fourth + fifth;
        System.out.println("Result after interchanging: " + result);
    }
}
