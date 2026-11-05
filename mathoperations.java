import java.util.Scanner;


public class mathoperations {
    public static void main(String[] args) {
        System.out.println("Enter the first Number:");
        Scanner i = new Scanner(System.in);
        Float a = i.nextFloat();
        System.out.println("Enter the Second Number:");
        Float b = i.nextFloat();
        System.out.println("Enter your choice:");
        System.out.println("1. Addition\n2.Subtraction\n3.Multiply\n4.Division");
        Float c = i.nextFloat();
        if(c==1)
        {
            System.out.println(a+b);
        }
        else
        {    
        if(c==2)
        {
            System.out.println(a-b);
        }
        else
        {    
        if(c==3)
        {
            System.out.println(a*b);
        }
        else
        {
            if(a == 0 || b==0)
            {
                System.err.println("invalid input\n cannot Divide with Zero");
            }
            else 
            {
                System.out.println(a/b);
            }
        }
        i.close();
    }}}
    
    
}
