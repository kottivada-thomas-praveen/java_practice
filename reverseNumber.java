

public class reverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;        
        // while (n>0){
        //     int digit = n%10;
        //     rev=rev*10+digit;
        //     n=n/10;
        // }
 int a = 10,b=20;

        for(int i=1;i<5;i++){
            rev =rev*10+n%10;
            n%=10;
        }
        System.out.println(rev);
    }
}