import java.util.Scanner;
public class reversesquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = s.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a-i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        s.close();
    }
}
