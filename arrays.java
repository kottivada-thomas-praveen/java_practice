import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.err.println("Enter the first array size:");
        int n = i.nextInt();
        String a[];
        a = new String[n];
        System.out.printf("enter the %d array elements:", n);
        for (int j = 0; j < n; j++) {
            a[j] = i.nextLine();
        }
        System.out.println("enter the second array size:");
        int m = i.nextInt();
        String b[] = new String[m];
        System.out.printf("Enter the %d array elements:", m);
        for (int j = 0; j < m; j++) {
            b[j] = i.nextLine();
        }
        String c[] = new String[n + m];
        c[n + m] = a[n] + b[m];
        System.out.printf("Total array:", c[n + m]);
        i.close();
    }
}