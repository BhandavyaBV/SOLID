package org.example.bad.L;

public class Main {
    public static void main(String[] args){

        System.out.println("Adding default users");
        AccountDAO accountDAO = new AccountDAO();
        accountDAO.addAccounts();

//        Creating a debit transaction
        DebitTransaction debitTransaction = new DebitTransaction(400,"james@gmail.com","accountPassword", accountDAO);
        debitTransaction.executeDebit();

//        Creating a credit transaction
        CreditTransaction creditTransaction = new CreditTransaction(400,"john@gmail.com","accountPassword2", accountDAO);
        creditTransaction.executeCredit();

        System.out.println("\nAbove code works if we instantiate respective objects.");
        System.out.println("But when we try to create an object of Transaction class, we will not be able to access executeDebit and executeCredit methods");
//        Transaction transaction = new DebitTransaction(400,"james@gmail.com","accountPassword", accountDAO);

    }

}
