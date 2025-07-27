import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 3, 5, 7, 8, 3, 5, 85, 9, 73, 5, 7, 4, 2, 4, 6, 5 };
        System.out.print("Enter the key to find in array: ");
        int key = sc.nextInt();
        int index = 0;

        for (int i : arr) {
            if (i == key) {
                System.out.println(key + " available at index " + index);
            }
            index++;
        }
    }
}
