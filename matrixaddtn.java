import java.util.Scanner;
public class matrixaddtn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The row and Column sizes of the First Matrix:");
        System.out.println("ROW Size:");
        int m = sc.nextInt();
        System.out.println("Column Size:");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter The first Matrix elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter The row and Column sizes of the Second Matrix:");
        System.out.println("ROW Size:");
        int x = sc.nextInt();
        System.out.println("Column Size:");
        int y = sc.nextInt();
        if(m!=x&&n!=y)
        {
            System.err.println("!!INVALID INPUTS\nROW AND COLUMN SIZES OF FIRST AND SECOND MATRIX MUST BE EQUAL.");
            System.err.println("CANNOT ADD");
        }
        else
        {
        int b[][] = new int[x][y];
        System.out.println("Enter The second Matrix elements:");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("first Matrix :\n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("second Matrix :\n");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }
        int c[][] = new int[m][y];
        System.out.println("Addtion of two Matrices:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(c[i][j]+"  ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
