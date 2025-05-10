import java.util.*;

public class TreeGridChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a cell number (1 to 12): ");
        int cellNumber = scanner.nextInt();

        if (cellNumber < 1 || cellNumber > 12) {
            System.out.println("Invalid cell number.");
        } else {
    
            int row = (cellNumber - 1) / 4 + 1;
            int col = (cellNumber - 1) % 4 + 1;

        
            if (row == 1 || row == 3 || col == 1 || col == 4) {
                System.out.println("Mango");
            } else {
                System.out.println("Supporter");
            }
        }

        scanner.close();
    }
}
