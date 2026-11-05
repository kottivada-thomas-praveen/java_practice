package exceptionHandling;

public class calc {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int res = 0;

        try{
            res = a/b;
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        

    }
}
