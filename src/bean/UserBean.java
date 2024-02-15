package bean;

import enums.UserRole;

public class UserBean {
    private String username;
    private String password;
    private Double balance;


    private UserRole role;

    public UserBean(String username, String password, Double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }
    public UserBean(){};
    public UserBean(String username, String password) {
        this.username = username;
        this.password = password;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
