import java.util.Scanner;

public class MultiArray {
    public int[][] elements() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of the array: ");
        int row = sc.nextInt();
        System.out.print("Enter the columns of the array: ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public int sum(int arr[][]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        return total;
    }

    public void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public double average(int arr[][]) {
        MultiArray obj = new MultiArray();
        int sum = obj.sum(arr);
        double average = (double) sum / arr.length;
        return average;
    }

    public static void main(String args[]) {
        MultiArray obj = new MultiArray();
        int[][] arr = obj.elements();
        obj.display(arr);
        System.out.println("The sum of all elements is: " + obj.sum(arr));
        System.out.println("The average of all elements is: " + obj.average(arr));
    }
}
