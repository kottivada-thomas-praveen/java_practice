package abstracts;

public abstract class calculatorAC implements calculatorDocument {
    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int product(int a, int b) {
        return a*b;
    }

    public abstract int divison(int a, int b);

}
