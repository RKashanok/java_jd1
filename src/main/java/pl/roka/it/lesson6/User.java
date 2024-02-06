package pl.roka.it.lesson6;

public class User {

    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    private String hidePassword(String password) {
        String salt = "qMnv*y6bYbkF";
        byte[] saltBytes = salt.getBytes();
        byte[] passBytes = password.getBytes();
        byte[] saltedPass;
        if (saltBytes.length > passBytes.length) {
            saltedPass = new byte[passBytes.length * 2];
        } else {
            saltedPass = new byte[saltBytes.length * 2];
        }

        for (int i = 0; i < saltedPass.length/2; i+=2) {
            saltedPass[i] = saltBytes[i];
            saltedPass[i+1] = passBytes[i];
        }
        return new String(saltedPass);
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + hidePassword(password) + '\'' +
                '}';
    }
}
