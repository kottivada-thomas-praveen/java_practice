package collections.Map.hashMap;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * practice1
 */
public class practice1 {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        Map<String, Integer> hashmap = new HashMap<>();

       hashmap.put("thomas",7);
       hashmap.put("praveen", 8);
       hashmap.put("adam", 1);
       hashmap.put("tom", 9);

       hashmap.put("adam", 4);

       System.out.println(hashmap);


    }
}