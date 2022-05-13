package githubcopilot;
public class test02 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class UserDAO {
    private String username;
    private String password;
    UserDAO() {
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //generate random username
    public String generateUsername() {
        //generate random username
        String username = "";
        for (int i = 0; i < 10; i++) {
            username += (char) (Math.random() * 26 + 97);
        }
        return username;
    }

    //generate random password
    public String generatePassword() {
        //generate random password
        String password = "";
        for (int i = 0; i < 10; i++) {
            password += (char) (Math.random() * 26 + 97);
        }
        return password;
    }
}