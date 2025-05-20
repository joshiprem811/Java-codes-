public class stringpalindrome {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";
        int i = s.length() - 1;
        while (i >= 0) {
            rev = rev + s.substring(i, i + 1);
            i--;
        }
        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
