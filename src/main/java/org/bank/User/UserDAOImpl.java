package org.bank.User;

import org.bank.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public void updateUser(User user) throws SQLException {
        String sql = "update users set firstName = ?, lastName = ?, birthYear = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setInt(3, user.getBirthYear());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("User updated");
        else
            System.out.println("Something went wrong");


    }

    @Override
    public void deleteUser(int id) throws SQLException {
    String sql = "delete from users where id=?";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1,id);
    int count = preparedStatement.executeUpdate();
    if(count > 0)
        System.out.println("User has been deleted");
    else
        System.out.println("Something happened");
    }

    @Override
    public void addCheckingAccount(User user) {

    }

    @Override
    public User loginAccount(int id) throws SQLException {
//        change this to be ResultSet

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
