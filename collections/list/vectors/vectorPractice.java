package collections.list.vectors;
import java.util.Vector;

public class vectorPractice {
    public static void main(String[] args) {
        // Creation
        Vector<Integer> v1 = new Vector<>(5);

        // Addition of elements
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        v1.add(7);
        v1.add(8);
        v1.add(9);
        v1.add(10);
        v1.add(11);

        System.out.println(v1);

        System.out.println(v1.size());
        System.out.println(v1.capacity());

        // reterival of elements
        System.out.println(v1.get(0));
        System.out.println(v1.getFirst());
        System.out.println(v1.getLast());

        // Deletion of elements
        // System.out.println(v1.clear());

        // Verification of elements
        System.out.println(v1.contains(v1));
        // updation of elements
    }
}
