// Scenario: You are charged with the task of creating email accounts for new hires
// Generate an email with the following syntax:  firstname.lastname@department.company.com
// Generate a random String for a PW
// Have set methods to change the PW, set mailbox capacity, and define alternate email address
// Have get methods to display the name, email, and mailbox capacity


class Email {


    private int mailboxCapacity = 500;
    private String altEmailAddress;

    private String email;


    // constructor, will take in first, last and department, and generate email address
    // will call on method in Password class to generate random PW
    public Email(String firstName, String lastName, String department) {
        //System.out.println("Name entered as " + this.firstName + " " + this.lastName);
        //System.out.println("Email enterered as " + this.email);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + department + "@mindbodyonline.com";
    }


    // setter method to change mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // setter method to define alternate email address
    public void setAltEmailAddress(String altEmail) {
        this.altEmailAddress = altEmail;
    }


    String getAltEmailAddress() {
        return this.altEmailAddress;
    }

    // getter method for email
    String getEmail() {
        return this.email;
    }

    // getter method for mailbox capacity
    int getMailboxCapacity() {
        return this.mailboxCapacity;
    }
}
