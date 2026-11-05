package arrays;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = input.nextInt();
        int i[] = new int[size];

        System.out.println("Enter the numbers of Array:");
        for (int m = 0; m < size; m++) {
            System.out.printf("%d Number:", m);
            int num = input.nextInt();
            i[m] = num;
        }

        for (int m = 0; m < i.length; m++) {
            sum += i[m];
        }

        System.out.println(sum);

        input.close();

    }
}
