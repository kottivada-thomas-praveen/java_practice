package accessModifiers;

import OOPs.inheritance.guest;

public class accessPublic {
    public int i = 10;

    public void testpublic(){
        System.out.println("public Method");
    }

    accessPublic(){
        
    }

    public static void main(String[] args) {
        guest n = new guest();
        // accessPublic p = new accessPublic();
        n.read();
    }

    // we can access within the class, package and application and outside the class,package and applications

}
