import java.util.Scanner;
public class vowelsexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        try {
            if (str.length() == 0) {
                throw
                new Exception("String is empty");
            }
            else {
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        System.out.println("String has vowels");
                        break;
                    }
                    else if (i == str.length() - 1) {
                        throw new Exception("String does not have vowels");
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}