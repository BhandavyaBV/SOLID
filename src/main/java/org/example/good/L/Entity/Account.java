package org.example.good.L.Entity;

public class Account {
    String username;
    String password;
    long accountBalance;

    public Account(String username, String password, long accountBalance) {
        this.username = username;
        this.password = password;
        this.accountBalance = accountBalance;
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

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }
}
