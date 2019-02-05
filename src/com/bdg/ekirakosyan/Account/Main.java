package Account;

public class Main {
    public static void main(String[] args) {
        Accout a1 = new Accout("id-123", "Account 1", 2815);


        System.out.println("Credit: " + a1.credit(55));
        System.out.println("Debet: " + a1.debet(86));

        Accout a2 = new Accout("id-557", "Account 2", 15);
        System.out.println("Debet: " + a1.transferTo(a2, 450));

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
