public class Main {

    public static void main (String [] args) {

       // Password pw1 = new Password();
        Employee em1 = new Employee("William", "Powell", "dev");


        em1.resetPassword();


        System.out.println(em1.getMailboxCapacity());

    }
}
