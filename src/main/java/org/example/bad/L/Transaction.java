package org.example.bad.L;

import org.example.bad.L.Entity.Account;

import java.util.ArrayList;

public class Transaction {

    protected double amount;
    protected String username;
    protected String password;
    protected AccountDAO accountDAO;

    protected Account currentUser=null;

    protected static ArrayList<Account> accounts;


    public Transaction(double amount, String username , String password, AccountDAO accountDAO) {
        this.amount = amount;
        this.username = username;
        this.password = password;
        this.accountDAO = accountDAO;
    }

    public Account authenticateAccount(){
        System.out.println("Authenticating user : "+username );
        accounts = accountDAO.getAccounts();
        for(Account account : accounts){
            if(account.getUsername().equals(username) && account.getPassword().equals(password)){
                System.out.println("User successfully authenticated");
                currentUser = account;
                return account;
            }
        }

        System.out.println("Invalid user credentials");
        return null;
    }

    public boolean checkBalance(){
        System.out.println("\n Checking user balance to perform transaction");
        if(currentUser==null)
            return false;
       if(currentUser.getAccountBalance()>amount){
           System.out.println("Balance greator than debit amount.");
           return true;
       }

       else{
           System.out.println("Insufficient balance");
           return false;
       }
    }
}
