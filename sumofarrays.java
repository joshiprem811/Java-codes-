import java.util.Arrays;

public class sumofarrays {
    public static void main(String[] args) {
        int[] arr1 = {10000};
        int[] arr2 = {1};

        // Check if both arrays have the same length
        if (arr1.length != arr2.length) {
            System.out.println("Arrays must be of the same length.");
            return;
        }

        int[] sumArray = new int[arr1.length];

        // Element-wise sum
        for (int i = 0; i < arr1.length; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum of Arrays: " + Arrays.toString(sumArray));
    }
}
