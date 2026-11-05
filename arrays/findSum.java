package arrays;

import java.util.Scanner;

public class findSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size = input.nextInt();

        int arr[] = new int[size];
        int sum = 0;

        System.out.printf("Enter the %d elements : ", size);
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is : "+sum);

        input.close();
        
        // System.out.println("The array is :");
        // for (int i = 0; i < size; i++) {
        //     System.out.print(arr[i]+"\n");
        // }

    }
}
