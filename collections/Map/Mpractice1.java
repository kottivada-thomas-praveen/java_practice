package collections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * Mpractice1
 */
public class Mpractice1 {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter key : ");
        int key = input.nextInt();

        System.out.println("Enter value : ");
        String value = input.nextLine();

        map.put(key, value);
        map.put(key,value);
        // map.put(2, "Praveen");

        System.out.println(map);
        input.close();
    }
}