package accessModifiers;

public class accessPrivate {
    // private int i = 10;

    private void privateTest(){
        System.out.println("Private class");
    }

    public static void main(String[] args) {
        accessPrivate n = new accessPrivate();
        n.privateTest();
    }
}
