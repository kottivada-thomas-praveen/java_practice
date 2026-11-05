package arrays;

import java.util.Scanner;


public class findAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Find the Average of given Array.");
        System.out.println("Enter the Array Size:");
        int size = input.nextInt();

        int arr[] = new int[size];
        int sum=0;
        int avg;

        System.out.printf("Enter the %d elements : ", size);
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        for(int i=0;i<size;i++){
            sum += arr[i];
        }

        avg = sum/size;

        System.out.println("The Average is ; "+avg);
        input.close();
    }
}
