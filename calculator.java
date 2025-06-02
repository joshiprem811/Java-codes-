import java.sql.SQLOutput;
import java.util.Scanner;

class fun {
    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
    int mul(int a, int b) {
        return a * b;
    }
    int div(int a, int b) {
        return a / b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    int mod(int a, int b) {
        return a % b;
    }
}
class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println();
        System.out.print("Enter the second number: ");
        int c = sc.nextInt();
        fun f = new fun();
        System.out.println();
        System.out.println("Addition of a and b : " + f.add(a, b));
        System.out.println("Subtraction of a and b : " + f.sub(a, b));
        System.out.println("Multiplication of a and b : " + f.mul(a, b));
        System.out.println("Division of a and b : " + f.div(a, b));
        System.out.println("Mod of a and b : " + f.mod(a, b));
        System.out.println("Addition of a, b and c : " + f.add(a, b, c));
    }
}
