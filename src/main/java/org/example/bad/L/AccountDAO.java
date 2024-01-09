package org.example.bad.L;

import org.example.bad.L.Entity.Account;

import java.util.ArrayList;

public class AccountDAO {
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public void addAccounts(){
        Account account1 = new Account("james@gmail.com","accountPassword",3589);
        Account account2 = new Account("john@gmail.com","accountPassword2",5936);

        accounts.add(account1);
        accounts.add(account2);

        System.out.println("Successfully added users information");
        System.out.println("Details of the existing accounts are : ");
        for(Account account:accounts){
            System.out.println(account.getUsername()+","+account.getPassword()+","+account.getAccountBalance());
        }
        System.out.println();
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public void updateArray(ArrayList<Account> updatedAccounts){
        accounts = updatedAccounts;
        System.out.println("Updated accounts are");
        for(Account account:accounts){
            System.out.println(account.getUsername()+","+account.getAccountBalance());
        }
    }
}
