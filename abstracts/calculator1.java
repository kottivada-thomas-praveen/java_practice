package abstracts;

public class calculator1 extends calculatorAC {

    public int modulus(int a, int b){
        return a%b;
    }

    public int divison(int a, int b){
            if ( a%2==0 && b%2==0) {
                System.err.println("Cannot divide with 0");
            }
            else System.out.println(a/b);

            return 0;
    }
}
