package arrays;
import java.util.Scanner;

public class findMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size = input.nextInt();

        int arr[] = new int[size];
        int maxNumber = 1;

        System.out.printf("Enter the %d elements : ", size);
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        for(int i=0;i<size;i++){
            if(maxNumber<=arr[i]){
                maxNumber = arr[i];
            }

        }

        System.out.println("The maximum number is : "+maxNumber);

        input.close();
    }
}
