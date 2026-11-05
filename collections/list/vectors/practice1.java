package collections.list.vectors;

import java.util.Scanner;
import java.util.Vector;

import loops.forEachLoop;

public class practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> vector1 = new Vector<>(6);
        int sum = 0;
        int avg;

        System.out.println("INPUT : ");
        
        for (int i = 0; i < vector1.capacity(); i++) {
            int n = input.nextInt();
            vector1.add(n);
        }

        //sum
        try{
            for (int i = 0; i < vector1.capacity(); i++) {
                sum += vector1.get(i);
            }
        }

        catch(ArrayIndexOutOfBoundsException aE){
            aE.getMessage();
        }

        System.out.println("SUM : "+sum);

        //Average
        avg = sum/vector1.size();
        System.out.println("AVERAGE : "+avg);

        

        input.close();

    }
}
