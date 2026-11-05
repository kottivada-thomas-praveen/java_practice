package arrays;
import java.util.Scanner;;

public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int i[] = new int[n+1];
        System.out.printf("Enter the %d numbers:\n",n);
        for(int x = 1;x<n+1;x++){
            System.out.printf("Enter the %d number:",x);
            int num = input.nextInt();
            i[x]=num;
        }

        for(int x=0; x<i.length;x++){
            System.out.println(i[x]);
        }
        input.close();
    }
}


