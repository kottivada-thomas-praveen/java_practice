package OOPs.inheritance;

public class developer extends guest {

    void write() {
        System.out.println("dev Write");
    }

    public static void main(String[] args) {
        guest guest = new guest();
        developer dev = new developer();
        guest.read();
        dev.write();
        // guest.writing();
    }


}
