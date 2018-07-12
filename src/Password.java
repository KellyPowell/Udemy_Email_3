// Scenario: You are charged with the task of creating email accounts for new hires
// Generate an email with the following syntax:  firstname.lastname@department.company.com
// Generate a random String for a PW
// Have set methods to change the PW, set mailbox capacity, and define alternate email address
// Have get methods to display the name, email, and mailbox capacity

class Password {
    //String password;
    // constructor??

    String password;



    Password() {    // package private? correct choice?

        this.password = setNewRandomPassword();
        //System.out.println("Random PW is " + this.password);

        //}
    }

    // method to return current PW
    String getPassword() {
        return this.password;
    }

    // method to generate (set) random PW
    String setNewRandomPassword() {
        int passwordLength = 10;
        String characterList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdeghijklmnopqrstuvwxyz0123456789%$#@";


        char[] passwordBuilder = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            int index = (int) (Math.random() * characterList.length());
            passwordBuilder[i] = characterList.charAt(index);
        }


        return new String(passwordBuilder);

    }

    // setter method to change password (figure out how to do validation?)


}
