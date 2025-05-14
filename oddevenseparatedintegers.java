import java.util.Scanner;

public class oddevenseparatedintegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];


        int[] even = new int[n];
        int[] odd = new int[n];
        int evenCount = 0, oddCount = 0;


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            } else {
                odd[oddCount++] = arr[i];
            }
        }


        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }


        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
