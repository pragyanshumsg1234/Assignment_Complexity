public class code_4 {
    public static void main(String[] args) {
        int[] arr = { 34, 21, 54, 65, 43 };
        int arr_size = arr.length;
        int i, second;
        // There should be at least two elements
        if (arr_size < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }
        int largest = second = Integer.MIN_VALUE;

        // Find the largest element
        for (i = 0; i < arr_size; i++)
            largest = Math.max(largest, arr[i]);

        // Find the second largest element
        for (i = 0; i < arr_size; i++) {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.println("There is no second " + "largest element");
        else
            System.out.println(second);
    }
}
