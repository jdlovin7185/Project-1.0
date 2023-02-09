package org.bank.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    void addUser(User user) throws SQLException;
    void updateUser(User user);
    void deleteUser(int id) throws SQLException;
    void addCheckingAccount(User user);
    User loginAccount(int id) throws SQLException;
    List<User> getUsers();

    User userById(int id);

}
