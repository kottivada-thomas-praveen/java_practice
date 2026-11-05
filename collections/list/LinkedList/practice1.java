package collections.list.LinkedList;

import java.util.LinkedList;

/**
 * Linkedlist practice1
 */
public class practice1 {

    public static void main(String[] args) {
        LinkedList<Integer> node = new LinkedList<>();
 
        node.add(7);
        node.add(5);
        node.add(2);
        node.add(8);
        node.add(1);
        // 7,5,2,8,1
        node.add(2, 9);  // 7,5,9,2,8,1
       
        node.set(2, 6); // 7,5,6,2,8,1

        // System.out.println(node.clone());  // 7,5,9,2,8,1 creates copy -  // 7,5,9,2,8,1

        System.out.println(node.element());  // 7,5,9,2,8,1 returns elements one by one - 7

        System.out.println(node.element());
        System.out.println(node);
    }
}