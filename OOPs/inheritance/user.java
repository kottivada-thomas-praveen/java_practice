package OOPs.inheritance;

public class user {
    public static void main(String[] args) {
        guest guest = new guest();
        guest.read();

        developer dev = new developer();
        dev.read();
        dev.write();

        admin admin = new admin();
        admin.read();
        admin.write();
        admin.manage();
    }
}


