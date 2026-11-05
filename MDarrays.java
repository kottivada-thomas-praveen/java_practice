import java.util.Scanner;
public class MDarrays {
    public static void main(String[] args) {
        System.out.println("Enter the MxN sizes of Matrix");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int m = sc.nextInt();
        System.out.println("enter the column size:");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter the Elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements:");
        for(int i=0;i<m;i++){
            // for(int j=0;j<n;j++){
            //     System.out.print(a[i][j]+"  ");
            // }
            // System.out.println();
            System.out.println(a[i].length );
        }
        sc.close();
    }   
}
