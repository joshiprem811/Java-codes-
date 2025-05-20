public class nonrepeating {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int non = 0;
        for (int num : arr) {
            non ^= num;
        }
        System.out.println("The non-repeating element is: " + non);
    }
}
