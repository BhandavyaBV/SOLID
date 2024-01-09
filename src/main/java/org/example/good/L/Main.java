package org.example.good.L;

public class Main {
    public static void main(String[] args){

        System.out.println("Adding default users");
        AccountDAO accountDAO = new AccountDAO();
        accountDAO.addAccounts();

//        Creating parent and assigning child object
//        Transaction transaction = new Transaction(400,"james@gmail.com","accountPassword", accountDAO);
        Transaction transaction = new DebitTransaction(400,"james@gmail.com","accountPassword", accountDAO);
        transaction.executeTransaction();

        //       Creating a credit transaction
        CreditTransaction creditTransaction = new CreditTransaction(400,"john@gmail.com","accountPassword2", accountDAO);
        creditTransaction.executeTransaction();
    }
}
