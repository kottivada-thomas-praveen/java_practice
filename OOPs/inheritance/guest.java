package OOPs.inheritance;

public class guest {
    public void read(){
        System.out.println("guest read");
    }

    private void writing(){
        System.out.println("writing");
    }

    public static void main(String[] args) {
        guest n = new guest();
        n.writing();
    }

}
