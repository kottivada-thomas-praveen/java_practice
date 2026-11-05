package strings;

public class basics {
    public static void main(String[] args) {
        String s1 = "Thomas";
        String s2 = new String("Thomas");
        String s3 = new String("Thomas");
        String s4 = "Thomas";

        System.out.println(s1==s2); // false
        System.out.println(s2==s3); // false
        System.out.println(s1==s4); // true

        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
    }
}