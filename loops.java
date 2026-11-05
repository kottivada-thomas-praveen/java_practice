import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("enter the Number:");
        int a = i.nextInt();
        System.err.println("Enter secod number:");
        int b = i.nextInt();
        System.err.println(a);
        System.err.println(b);
        a=b;
        b=a;
        System.err.println(a);
        System.err.println(b);
        i.close();
    }
}
