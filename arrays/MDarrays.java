package arrays;
import java.util.Scanner;

public class MDarrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row and column size of matrix:");
        System.out.println("Enter row size:");
        int rows = input.nextInt();
        System.out.println("Enter column size:");
        int columns = input.nextInt();
        int multiDimArray[][] = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                System.out.printf("Enter the %d row %d number:",i,j);
                int value = input.nextInt();
                multiDimArray[i][j] = value;
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
              System.out.print(multiDimArray[i][j]+" ");
            }
            System.out.println();
        }

        input.close();
    }
}
