// class AccountManager {
//     -registerUser(User user): Boolean
//     -addUserIdentification(User user, Identification identification): Boolean
//     -login(OTP: int): Boolean
//     -logout(): Boolean
// }

public class AccountManager {
    // methods
    public Boolean registerUser(String type) {
        // register user
        if (type == "Student"){
            Student user = new Student();
        }
        else if (type == "Staff") {
            Staff user = new Staff();
        }
        else{   
            Staff user = new Staff();
        }
        // store in database
        return true;
    }

    public Boolean addUserIdentification(User user, Identification identification) {
        user.setIdentification(identification);
        return true;
    }

    public Boolean login(int OTP) {
        // login
        return true;
    }

    public Boolean logout() {
        // logout
        return true;
    }
    
}