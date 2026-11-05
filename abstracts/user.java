package abstracts;

public class user {
    public static void main(String[] args) {
        calculator1 calculator1 = new calculator1();
        int add = calculator1.add(23,10);
        int sub = calculator1.sub(50, 1);
        int product = calculator1.product(7, 7);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(product);
        int divison = calculator1.divison(4, 2);
        
        
        System.out.println(divison);

        calculator2 calculator2 = new calculator2();
        calculator2.matrixCalculation();
    }
}
