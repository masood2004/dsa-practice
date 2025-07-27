import java.util.Scanner;

public class ArrayPractice {

    public int sum(int arr[]) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    public int[] elements() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + " element: ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public double average(int arr[]) {
        ArrayPractice obj = new ArrayPractice();
        int sum = obj.sum(arr);
        double average = (double) sum / arr.length;
        return average;
    }

    public void display(int arr[]) {
        for (int i : arr) {
            System.out.print("| " + i + " ");
        }
        System.out.println("|");
    }

    public static void main(String args[]) {
        ArrayPractice obj = new ArrayPractice();

        int arr[] = obj.elements();

        obj.display(arr);

        System.out.println("The sum of all the array elements is: " + obj.sum(arr));

        System.out.println("The average of all elements are: " + obj.average(arr));
    }
}
