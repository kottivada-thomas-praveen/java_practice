package abstracts;

public class calculator2 extends calculatorAC {

    

    public int matrixCalculation(){
        System.out.println("Matrix calucaltion code.");
        return 0;
    }

    public int divison(int a, int b) {
        if (b%2==0) {
            System.err.println("Cannot divide by 0");
        }

        return a/b;
    }
}
