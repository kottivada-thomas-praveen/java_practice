package collections.list.Stack;

import java.util.Stack;
/**
 * practice1
 */
public class practice1 {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // Stack<Integer> s2 = new Stack<>();

        // Adding Elements -
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        // Retrival of Elements - 
        for (Integer i : s) {
            System.out.println(i);
        }
        System.out.println(s); // returns array

        // Deletion of Elements -
        // s.remove(3);
        System.out.println(s.pop());

        // s.notify();
        // System.out.println(s);
    }
}