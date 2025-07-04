package pl.coderslab.entity;

public class User {
    private long id;
    private String userName;
    private String email;
    private String password;

    public void setId(long id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return this.id;
    }
    public String getUserName() {
        return this.userName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }

}
