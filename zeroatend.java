import java.util.Scanner;

public class zeroatend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        int[] digits = new int[20];
        int index = 0;

        int onesCount = 0;
        int zeroCount = 0;


        while (num > 0) {
            int digit = (int)(num % 10);
            if (digit == 1) {
                onesCount++;
            } else if (digit == 0) {
                zeroCount++;
            }
            num = num / 10;
        }


        for (int i = 0; i < onesCount; i++) {
            System.out.print("1");
        }


        for (int i = 0; i < zeroCount; i++) {
            System.out.print("0");
        }

        System.out.println();
        sc.close();
    }
}
