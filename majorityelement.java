import java.util.*;
public class majorityelement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        majorityelement sol = new majorityelement();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int[] nums1 = new int [n];
        for(int i = 0;i<n;i++){
            nums1[i]=sc.nextInt();
        }

            System.out.print(sol.majorityElement(nums1));

    }
}
