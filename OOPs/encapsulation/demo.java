package OOPs.encapsulation;

class human {

    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    
}

public class demo {
    public static void main(String[] args) {
        human h = new human();
        h.setAge(20);
        h.setName("Thomas");

        System.out.println(h.getName() +" : "+ h.getAge());
    }
}
