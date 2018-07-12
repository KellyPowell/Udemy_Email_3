public class Employee {
    String firstName;
    String lastName;
    private String name;
    String department;
    private Email email;
    private Password password;

    //constructor
    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.name = this.firstName + " " + this.lastName;

        this.password = new Password();

        this.email = new Email(this.firstName, this.lastName, this.department);

        //this.email = newEmail.getEmail();
        int mailboxCapacity = this.email.getMailboxCapacity();
        //System.out.println("Printing from Employee class. Email is " + this.email);
        String altEmailAddress = this.email.getAltEmailAddress();

        System.out.println("Name entered = " + this.getName());
        System.out.println("New email = " + this.getEmail());
        System.out.println("New PW = " + this.getPassword());
        System.out.println("MB Capacity = " + this.getMailboxCapacity());

    }


    String getName() {
        return this.name;
    }

    String getEmail() {
        return this.email.getEmail();
    }

    int getMailboxCapacity() {
        return this.email.getMailboxCapacity();
    }

    String getPassword() {
        return this.password.getPassword();
    }

    String resetPassword() {

        this.password = new Password();
        System.out.println("PW reset to = " + this.getPassword());
        return this.password.getPassword();
    }


}

