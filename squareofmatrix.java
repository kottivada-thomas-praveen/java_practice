import java.util.Scanner;
public class squareofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row and Column sizes of Matrix:");
        System.out.println("Row Size:");
        int m = sc.nextInt();
        System.out.println("column size:");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter The elements of the Mtarix::");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("INPUT:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf(a[i][j]+"  ");
            }
            System.out.println();
        }
        int b[][] = new int[m][n];
        System.out.println("OUTPUT:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j] = a[i][j]*a[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j]+"  ");
            }
           System.out.println(); 
        }
        sc.close();
    }
}