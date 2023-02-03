package org.bank.Account;

public class AccountDAOFactory {
    private static AccountDAO dao;
    private AccountDAOFactory(){

    }

    public static AccountDAO getAccountsDao(){
        if(dao == null)
            dao = new AccountsDAOImpl();
        return dao;
    }
}
