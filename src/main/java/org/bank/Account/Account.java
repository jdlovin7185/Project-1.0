package org.bank.Account;

public class Account {
    private int account_number;
    private int balance;
    private int opening_balance;
    private int id;
    private String pendingAccount;
    private String pendingTransferIn;
    private int pendingTransferAmount;
    public Account() {

    }

    public Account(int account_number, int balance, int opening_balance, int id, String pendingAccount, String pendingTransferIn, int pendingTransferAmount) {
        this.account_number = account_number;
        this.balance = balance;
        this.opening_balance = opening_balance;
        this.id = id;
        this.pendingAccount = pendingAccount;
        this.pendingTransferIn = pendingTransferIn;
        this.pendingTransferAmount = pendingTransferAmount;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getOpening_balance() {
        return opening_balance;
    }

    public void setOpening_balance(int opening_balance) {
        this.opening_balance = opening_balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPendingAccount() {
        return pendingAccount;
    }

    public void setPendingAccount(String pendingAccount) {
        this.pendingAccount = pendingAccount;
    }

    public String getPendingTransferIn() {
        return pendingTransferIn;
    }

    public void setPendingTransferIn(String pendingTransferIn) {
        this.pendingTransferIn = pendingTransferIn;
    }

    public int getPendingTransferAmount() {
        return pendingTransferAmount;
    }

    public void setPendingTransferAmount(int pendingTransferAmount) {
        this.pendingTransferAmount = pendingTransferAmount;
    }
}
