import java.util.Scanner;
public class inverseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and Column size of the Matrix:");
        System.out.println("Row Size:");
        int m = sc.nextInt();
        System.out.println("Column Size:");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter "+m*n+" elements of matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("OUTPUT:");
        sc.close();
    }
}
