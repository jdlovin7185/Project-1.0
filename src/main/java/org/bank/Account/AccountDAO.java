package org.bank.Account;

import java.util.List;

public interface AccountDAO {
    Account checkAccount(int account_number);
    void addAccount(Account account);
    void depositAccount(Account account);
    void withdrawAccount(Account account);
    void deleteAccount(Account account);
    void approveAccount(Account account);
    void pendingTransfer(Account account);
    void checkIncomingTransfer(Account account);

    List<Account> pendingAccounts();
    List<Account> getAccounts();

    Account accountsById(int id);
}
