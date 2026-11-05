import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = s.nextInt();
        for(int i=0;i<a+1;i++){
            for(int j=0;j<i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        s.close();
    }
}
