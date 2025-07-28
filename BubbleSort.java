public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = { 3, 5, 7, 8, 3, 5, 85, 9, 73, 5, 7, 4, 2, 4, 6, 5 };
        System.out.print("Original array: | ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Bubble Sort

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Swap Values
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array:   | ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
