package collections.list.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.println("enter size :");
        int size = input.nextInt();

        ArrayList<Integer> al1 = new ArrayList<>(size);
        System.out.println("Enter elements : ");

        for(int i=1; i<=size; i++){
            int n = input.nextInt();
            al1.add(i);
        }

        // for(int i : al1){
        //     al1.
        // }

        System.err.println(al1);
        input.close();
        
    }
}
