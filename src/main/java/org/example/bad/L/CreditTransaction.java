package org.example.bad.L;

import org.example.bad.L.Entity.Account;

import java.util.ArrayList;

public class CreditTransaction extends Transaction {
    public CreditTransaction(double amount, String username, String password, AccountDAO accountDAO) {
        super(amount, username, password, accountDAO);
    }

    @Override
    public Account authenticateAccount() {
        return super.authenticateAccount();
    }

    @Override
    public boolean checkBalance() {
        return true;
    }

    public void executeCredit(){
        System.out.println("Performing credit for the user "+username);
        System.out.println("Credit amount : "+amount);
        System.out.println();
        Account account = authenticateAccount();
        if(account!=null){

            ArrayList<Account> accounts = accountDAO.getAccounts();
            accounts.remove(account);
            account.setAccountBalance((long)(account.getAccountBalance()+amount));
            System.out.println("Successfully performed debit. Updating the changes\n");
            accounts.add(account);
            accountDAO.updateArray(accounts);
        }
    }
}
