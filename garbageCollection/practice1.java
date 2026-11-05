package garbageCollection;

public class practice1 {
    public static void main(String[] args) {

        public Static finalise(){
            System.out.println("method is called");
        }
        practice1 p1 = new practice1();
        practice1 p2 = new practice1();
        practice1 p3 = new practice1();

        System.gc();
    }
}
+