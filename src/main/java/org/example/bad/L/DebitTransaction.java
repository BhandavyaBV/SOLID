package org.example.bad.L;

import org.example.bad.L.AccountDAO;
import org.example.bad.L.Entity.Account;
import org.example.bad.L.Transaction;

import java.util.ArrayList;

public class DebitTransaction extends Transaction {
    public DebitTransaction(double amount, String username, String password, AccountDAO accountDAO) {
        super(amount, username, password, accountDAO);
    }

    @Override
    public Account authenticateAccount() {
        return super.authenticateAccount();
    }

    @Override
    public boolean checkBalance() {
        return super.checkBalance();
    }

    public void executeDebit(){
        System.out.println("Performing debit for the user "+username);
        System.out.println("Debit amount : "+amount);
        System.out.println();
        Account account = authenticateAccount();
        if(account!=null && checkBalance()){

            ArrayList<Account> accounts = accountDAO.getAccounts();
            accounts.remove(account);
            account.setAccountBalance((long)(account.getAccountBalance()-amount));
            System.out.println("Successfully performed debit. Updating the changes\n");
            accounts.add(account);
            accountDAO.updateArray(accounts);
        }
    }
}
