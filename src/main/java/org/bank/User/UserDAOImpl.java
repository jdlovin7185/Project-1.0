package org.bank.User;

import org.bank.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDAOImpl implements UserDAO{

//    private static final Statement statement = null;
    Connection connection = null;

    public UserDAOImpl() {
        try{
            this.connection = ConnectionFactory.getConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                }
        }

    @Override
    public void addUser(User user) throws SQLException {
        String sql = "insert into users (firstName, lastName, birthYear) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setInt(3, user.getBirthYear());
        int count = preparedStatement.executeUpdate();
        if (count > 0){
            System.out.println("User added");
        } else
            System.out.println("Something happened");
    }


    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void addCheckingAccount(User user) {

    }

    @Override
    public User loginAccount(int id) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User userById(int id) {
        return null;
    }
}
