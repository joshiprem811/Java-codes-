import java.util.Scanner;
public class possiblesubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nAll substrings are:");

        int length = input.length();
        for (int start = 0; start < length; start++) {
            for (int end = start + 1; end <= length; end++) {
                System.out.println(input.substring(start, end));
            }
        }
        scanner.close();
    }
}
