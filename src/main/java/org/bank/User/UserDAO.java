package org.bank.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    void addUser(User user) throws SQLException;
    void updateUser(User user);
    void deleteUser(int id);
    void addCheckingAccount(User user);
    User loginAccount(int id);
    List<User> getUsers();

    User userById(int id);

}
